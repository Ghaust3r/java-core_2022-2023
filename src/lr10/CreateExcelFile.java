package lr10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFile {
    public static void main(String[] args) throws IOException {
        //создаем новую книгу Excel
        XSSFWorkbook workbook=new XSSFWorkbook();

        //создаем страницу в книге
        XSSFSheet sheet= workbook.createSheet("Товары");

        //Записываем данные в ячейки
        Row headerRow=sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1=sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2=sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 16gb");
        dataRow2.createCell(2).setCellValue(25500.0);

        //Записываем книгу в XML-файл
        String filePath="D://Primer/example3.xlsx";
        FileOutputStream outputStream=new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл "+filePath);
    }
}
