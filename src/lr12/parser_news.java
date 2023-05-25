package lr12;



import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class parser_news {
    private static final String url = "https://4pda.to/news/";
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException, NullPointerException {

        System.out.println("Это парсер новостного сайта 4PDA");
        System.out.println("Что желаете?");
        System.out.println("1. Показать свежие новости");
        System.out.println("2. Сохранить данные в файле формата json");
        System.out.println("3. Сохранить данные в файле формата Excel");
        System.out.println("4. Сохранить данные в файле формата txt");
        System.out.println("5. Выйти");
        int chose = in.nextInt();
        switch (chose) {
            case (1) -> getPage(url);

            case (2) -> {
                System.out.println("Введите путь, куда сохранить файл, например D://Primer/primer.json");
                String path = in.next();
               writeToJson(url,path);
            }

            case (3) -> {
                System.out.println("Введите путь, куда сохранить файл, например D://Primer/primer.xlsx");
                String path1 = in.next();
               writeToExcel(url,path1);
            }

            case (4) -> {
                System.out.println("Введите путь, куда сохранить файл, например D://Primer/primer.txt");
                String path2 = in.next();
                writeToTxt(url,path2);
            }
            default -> System.out.println("Пока");
        }

    }

   private static void getPage (String url){
        try {

            Document weatherPage3 = Jsoup.connect(url).get();
            Elements newsNames3 = weatherPage3.getElementsByAttributeValue("itemprop", "url");
            for (Element News : newsNames3) {
                String newsLink = News.attr("href");
                System.out.println(newsLink);

                String name = News.attr("title");
                System.out.println(name);

                System.out.println("Подключение к деталям");
                Document post = Jsoup.connect(newsLink).get();
                try {
                    Element author = post.getElementsByClass("name").first().child(0);
                    String autor = author.text();
                    System.out.println(autor);
                    Element date = post.getElementsByClass("date").first();
                    String Date = date.text();
                    System.out.println(Date);
                } catch (NullPointerException e) {
                    System.out.println("Нет данных");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


private static void writeToJson(String url,String path){
    if (getFileExtension(path).equals(".json")) {
        Document weatherPage = null;
        try {
            weatherPage = Jsoup.connect(url).get();

        Elements newsNames = weatherPage.getElementsByAttributeValue("itemprop", "url");
        try {

            JSONArray newsArray = new JSONArray();
            JSONObject n3w = new JSONObject();

            for (Element News : newsNames) {
                JSONObject object = new JSONObject();

                String newsLink = News.attr("href");

                String name = News.attr("title");
                System.out.println("Подключение к деталям");
                Document post = Jsoup.connect(newsLink).get();
                try {
                    Element author = post.getElementsByClass("name").first().child(0);
                    String autor = author.text();

                    Element date = post.getElementsByClass("date").first();
                    String Date = date.text();

                    object.put("Название статьи", name);
                    object.put("Ссылка", newsLink);
                    object.put("Автор", autor);
                    object.put("Дата", Date);

                    newsArray.add(object);
                    n3w.put("Новости", newsArray);

                } catch (NullPointerException e) {
                    System.out.println(" Чего то не хватает");
                }
            }

            FileWriter fw = new FileWriter(path);
            fw.write(n3w.toJSONString());
            fw.flush();
            fw.close();
            System.out.println("Данные записаны в "+path);
        } catch (Exception e) {
            System.out.println(e);
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    else {
        throw new RuntimeException("Введено неправильное расширение");
    }


}
    private static void writeToExcel(String url,String path1){
        if (getFileExtension(path1).equals(".xlsx")) {
            XSSFWorkbook Knigga = new XSSFWorkbook();
            XSSFSheet sheet = Knigga.createSheet("Новости");
            Document weatherPage1 = null;
            try {
                weatherPage1 = Jsoup.connect(url).get();

            Elements newsNames1 = weatherPage1.getElementsByAttributeValue("itemprop", "url");
            Row zagolovki = sheet.createRow(0);
            zagolovki.createCell(0).setCellValue("Название статьи");
            zagolovki.createCell(1).setCellValue("Ссылка");
            zagolovki.createCell(2).setCellValue("Автор");
            zagolovki.createCell(3).setCellValue("Дата создания");
            try {
                int i = 0;
                for (Element News : newsNames1) {

                    String newsLink = News.attr("href");

                    String name = News.attr("title");
                    System.out.println("Подключение к деталям");
                    Document post = Jsoup.connect(newsLink).get();
                    try {
                        Element author = post.getElementsByClass("name").first().child(0);
                        String autor = author.text();

                        Element date = post.getElementsByClass("date").first();
                        String Date = date.text();

                        Row novosti = sheet.createRow(i);

                        novosti.createCell(0).setCellValue(name);
                        novosti.createCell(1).setCellValue(newsLink);
                        novosti.createCell(2).setCellValue(autor);
                        novosti.createCell(3).setCellValue(Date);
                    } catch (NullPointerException e) {
                        System.out.println("Нет данных");
                    }
                    i++;
                }

                FileOutputStream outputStream = new FileOutputStream(path1);
                Knigga.write(outputStream);
                Knigga.close();
                outputStream.close();
                System.out.println("Данные записаны в "+path1);
            } catch (Exception e) {
                System.out.println(e);
            }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            throw new RuntimeException("Введено неправильное расширение");
        }
    }

    private static void writeToTxt(String url,String path2){
        if (getFileExtension(path2).equals(".txt")) {
            BufferedWriter writer = null;
            Document weatherPage2 = null;
            try {
                weatherPage2 = Jsoup.connect(url).get();

            Elements newsNames2 = weatherPage2.getElementsByAttributeValue("itemprop", "url");
            writer = new BufferedWriter(new FileWriter(path2));
            for (Element News : newsNames2) {

                String newsLink = News.attr("href");

                String name = News.attr("title");
                System.out.println("Подключение к деталям");
                Document post = Jsoup.connect(newsLink).get();
                try {
                    Element author = post.getElementsByClass("name").first().child(0);
                    String autor = author.text();

                    Element date = post.getElementsByClass("date").first();
                    String Date = date.text();
                    try {

                        writer.write(name + "  " + newsLink + " " + autor + "  " + Date + "\n");


                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (NullPointerException e) {
                    System.out.println("Нет данных");

                }

            }
            writer.flush();
            writer.close();
            System.out.println("Данные записаны в "+path2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            throw new RuntimeException("Введено неправильное расширение");
        }
    }

    private static String getFileExtension(String path) {
        int index = path.indexOf('.');
        return index == -1? null : path.substring(index);
    }

}

