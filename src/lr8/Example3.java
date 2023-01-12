package lr8;

import java.io.*;
import java.sql.SQLOutput;


public class Example3 {
    public static void main(String[] args) throws IOException {
       BufferedReader br=null;
       PrintWriter out=null;
       try{
       br=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Primer\\MyFile1.txt"),"UTF-8"));
       out=new PrintWriter("C:\\Primer\\MyFile2.txt","UTF-8");
       int lineCount=1;
       int Score;
       String letters="ЙйЦцКкНнГгШшЩщЗзХхФфВвПпРрЛлДдЖжЧчСсМмТтБб";
       String s;
       while((s=br.readLine())!=null){
           Score=0;
           for(String word:s.split("\\s+")){
               if (letters.contains (word.substring(0,1))){
                   Score++;
                   out.println(word);
               }
           }
           out.println(lineCount+" строка, количество выбранных слов = "+Score);
           lineCount++;
           out.println();
       }
       } catch (IOException e){
           System.out.println("Ошибка");
       } finally{
           br.close();
           out.flush();
           out.close();
       }
    }
    }
















