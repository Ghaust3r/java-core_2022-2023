package lr10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try{
            JSONParser parser=new JSONParser();
            Object obj=parser.parse(new FileReader("D://Primer/example2-json.json"));
            JSONObject jsonObject=(JSONObject)obj;
            System.out.println("Строковый элемент "+jsonObject.keySet().iterator().next());
            JSONArray jsonArray= (JSONArray) jsonObject.get("books");
            for (Object o:jsonArray){
                JSONObject book=(JSONObject) o;
                System.out.println("\n текущий элемент: book");
                System.out.println("неазвание книги: "+book.get("title"));
                System.out.println("автор: "+book.get("author"));
                System.out.println("год издания: "+book.get("year"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
