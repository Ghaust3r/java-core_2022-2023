package lr8;

import java.io.*;

public class Primer7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        BufferedWriter out=null;
        try {
            //Создание файловых символьных потоков для чтения и записи
            br=new BufferedReader(new FileReader ("D:\\Primer\\MyFile.txt"),1024); //1024 - это размер буфера
            out=new BufferedWriter(new FileWriter("D:\\Primer\\MyFile2.txt"));
            int lineCount=0;
            String s;
//            Переписывание информации из одного файла в другой
            while ((s=br.readLine()) !=null){
              lineCount++;
                System.out.println(lineCount+ ": "+s);
                out.write(s);
                out.newLine(); //Переход на новую строку
            }
        }
        catch (IOException e){
            System.out.println("Ошибка");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
