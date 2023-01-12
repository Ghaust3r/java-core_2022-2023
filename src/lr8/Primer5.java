package lr8;

import java.io.*;
import java.util.Scanner;

public class Primer5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите имя файла => ");
        String fname=sc.nextLine();
        try {
            File f1=new File("D:\\Primer\\fname");
            f1.createNewFile();
            System.out.println("Полный путь файла "+f1.getAbsolutePath());
            System.out.println("Введите количество строк для записи в файл => ");
            int n=sc.nextInt();
            DataOutputStream dOut=new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i=0;i<n;i++){
                System.out.println("Введите строку для записи в файл => ");
                String s=sc.nextLine();
                dOut.writeUTF(s+ "\n");
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); // закрываем поток

            // Чтение и вывод данных из созданного файла
            DataInputStream dIn=new DataInputStream(new FileInputStream(f1));
            while (true) {
                System.out.println(dIn.readUTF());
            }
        }
        catch (Exception e) {
            System.out.println(""+e);
        }
    }
}


