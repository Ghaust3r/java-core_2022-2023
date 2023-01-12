package lr8;

import java.io.File;

public class Primer1 {
    public static void main (String[] args){
        try {
            File f1 = new File("D:\\MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Файл создан!!!");
            }
                else System.out.println("Полный путь: "+f1.getAbsolutePath());
            File f2=new File("D:\\Papka1\\Papka2\\Papka3");
            f2.mkdirs();
            System.out.println("Полный путь 2: "+ f2.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка: "+e);
        }
    }
}
