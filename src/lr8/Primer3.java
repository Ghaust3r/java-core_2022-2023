package lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Primer3 {
//    Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
       byte [] buff=new byte [5];
       while (true){
           int count=in.read(buff);
           if (count !=-1){                    //Если не конец файта
               System.out.println("Количество "+count+",buff = "+ Arrays.toString(buff)+ ",str= "+new String (buff,0,count, "cp1251")); //UTF8 а так же данные буфера преобразовались в строку
           }
           else {break;}
       }
    }

    public static void main(String[] args) throws IOException {
        String fileName="D://MyFile.txt";
        InputStream inFile=null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла "+e);
        }
        finally {                  //корректное закрытие потока
if (inFile !=null){
    try {
        inFile.close();
    } catch (IOException ignore){
//        NOP - No Operation
    }
}
        }
    }
}
