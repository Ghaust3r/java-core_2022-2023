package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class JsonCreator {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D://Primer/example2-json.json");
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(fr);

            JSONObject library = new JSONObject();
            JSONArray books = new JSONArray();
            JSONObject book1 = new JSONObject();
            book1.put("title", "Война и мир");
            book1.put("author", "Лев Толстой");
            book1.put("year", 1869);
            JSONObject book2 = new JSONObject();
            book2.put("title", "Мастер и Маргарита");
            book2.put("author", "Иванов");
            book2.put("year", 1967);
            books.add(book1);
            books.add(book2);
            library.put("books", books);

            JSONArray jsonArray = (JSONArray) obj.get("books");
            String author = "Иванов";
            jsonArray.stream()
                    .filter(book -> book instanceof JSONObject)
                    .map(book -> (JSONObject) book)
                    .filter(book -> author.equals(obj.get("author")))
                    .forEach(book -> {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + obj.get("title"));
                        System.out.println("Автор: " + obj.get("author"));
                        System.out.println("Год издания: " + obj.get("year"));
                    });


            try
                    (FileWriter file = new FileWriter("D://Primer/example2-json.json")) {
                file.write(library.toJSONString());
                System.out.println("Json файл создан");
            } catch (Exception e) {
                e.printStackTrace();


            }
        }
        catch (Exception e)
        {
            System.out.println("ебааааать " + e);
        }
    }
}
