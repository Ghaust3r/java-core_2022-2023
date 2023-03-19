package lr10;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;

public class task2 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Что хотите сделать?");
        System.out.println("1. Поиск игры по разработчику");
        System.out.println("2. Добавить новую игру");
        System.out.println("3. Удалить игру");
        int chose1 = in.nextInt();
        FileReader fr = new FileReader("D://Primer/example2-json.json");
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(fr);

        JSONObject library = new JSONObject();
        switch (chose1) {
            case (1):

                JSONArray jsonArray = (JSONArray) obj.get("games");

                ArrayList<String> games = new ArrayList<String>();

                if(jsonArray != null)
                {
                    for(int i = 0; i < jsonArray.size(); i++)
                    {
                        games.add(jsonArray.get(i).toString());
                    }
                }

                System.out.println("Введите студию разработчика");
                String devel = in.next();
                games.stream()
                        .filter(s->s.contains(devel))
                        .forEach(s->
                                System.out.println(s));



                return;

            case (2):
                System.out.println("Добавить игру?");
                System.out.println("1. Да");
                System.out.println("2. Нет");
                String chose2 = in.next();
                if (chose2.equals("1")) {

                    System.out.println("Введите название игры");
                    String name = in.next();
                    System.out.println("Введите разработчиков игры");
                    String dev = in.next();
                    System.out.println("Введите дату релиза игры");
                    int date = in.nextInt();



                    JSONArray jsonArray1 = (JSONArray) obj.get("games");
                    JSONObject newBook = new JSONObject();
                    newBook.put("name", name);
                    newBook.put("developers", dev);
                    newBook.put("year", date);
                    jsonArray1.add(newBook);
                    library.put("games", jsonArray1);



                    FileWriter fw = new FileWriter("D://Primer/example2-json.json");
                    fw.write(library.toJSONString());
                    fw.flush();
                    fw.close();
                }
                else {
                    return;
                }





            case(3):
                System.out.println("Введите название игры");
                String name1=in.next();
                JSONArray jsonArray2 = (JSONArray) obj.get("games");
                Iterator<Object> iterator = jsonArray2.iterator();


                while (iterator.hasNext()) {
                    JSONObject jo = (JSONObject) iterator.next();
                    if(name1.equals(jo.get("name"))) {
                        iterator.remove();
                        System.out.println("балдеж");
                    }
                }




                FileWriter fw = new FileWriter("D://Primer/example2-json.json");
                fw.write(obj.toJSONString());
                fw.flush();
                fw.close();


                    return;

            default:
              break;

        }

            fr.close();
        }
    }






