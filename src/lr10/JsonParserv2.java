//package lr10;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;
//
//public class JsonParserv2 {
//    public static void main(String[] args) {
//
//
//
//
//        try {
////            JSONParser jsonParser = new JSONParser();
////            Object obj = jsonParser.parse(new FileReader("D://Primer/task2,5.json"));
////            JSONObject jsonObject=(JSONObject)obj;
////            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
//
//            JSONObject library =new JSONObject();
//            JSONArray books=new JSONArray();
//            JSONObject book1=new JSONObject();
//
////            System.out.println(jsonArray);
//            JSONObject book1 = new JSONObject();
//            book1.put("title","Война и мир");
//            book1.put("author","Лев Толстой");
//            book1.put("year",1869);
//
//            jsonArray.add(book1);
//            System.out.println(jsonArray);
//
//            FileWriter file = new FileWriter("D://Primer/task2,5.json");
//            file.write(jsonArray.toJSONString());
//            file.flush();
//            file.close();
//
//        } catch (ParseException | IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}