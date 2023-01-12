package lr8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Primer2 {
    public static void readAllByByte(InputStream in) throws IOException {
while (true){
    int oneByte=in.read(); //читает 1 байт
    if (oneByte !=-1){ //признак отсутствия конца файла
        System.out.print((char) oneByte);
    }
    else {
        System.out.print("\n" + "end");
    }
    break;
}
    }

    public static void main(String[] args) throws IOException{
try{

    //С потоком связан файл
    InputStream inFile=new FileInputStream("D:\\text.txt");
    readAllByByte(inFile);
    System.out.println("\n\n\n");
    inFile.close();

    //С потоком связан интернет-страница (сайт)
InputStream inUrl=new URL("http://google.com").openStream();
readAllByByte(inUrl);
    System.out.println("\n\n\n");
    inUrl.close();

// С потоком связан массив типа byte
    InputStream inArray=new ByteArrayInputStream(new byte [] {7,9,3,7,4});
    readAllByByte(inArray);
    System.out.println("\n\n\n");
    inArray.close();
} catch (IOException e){
    System.out.println("Ошибка "+e);
}
    }
}
