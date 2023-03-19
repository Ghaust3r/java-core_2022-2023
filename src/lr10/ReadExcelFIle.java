package lr10;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFIle {
    public static void main(String[] args)throws IOException {
        String filePath="D://Primer/example3.xlsx";

        //открываем файл для чтения
        FileInputStream fileInputStream=new FileInputStream(filePath);


        //создаем экземпляр книги
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);


        //получаем лист из книги по ег оимени
        XSSFSheet sheet=workbook.getSheet("Товары");


        //перебираем стркои и ячейки листов
        for (Row row: sheet) {
            for (Cell cell:row){
                //выводим значение ячейки на экран
                System.out.println(cell.toString() + "\t");
            }
            System.out.println();
        }
workbook.close();
        fileInputStream.close();
    }
}
