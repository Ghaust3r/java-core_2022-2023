package lr10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) throws IOException {
        String filePath = "D://Primer/example3.xlsx";           //запрашиваемый путь до файла с расширением
        String file = getFileExtension(new File(filePath));


        if (file.equals("xlsx")) {
            try {
                boolean fileExist;
                fileExist = Files.exists(Path.of(filePath));
                if (fileExist == false) {
                    throw new FileNotFoundException("Искомый файл не обнаружен. Убедитесь, что искомый файл сущесвтует и проверьте написание пути до файла");
                }

                FileInputStream fileInputStream = new FileInputStream(filePath);

                XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


                XSSFSheet sheet = workbook.getSheet("Товары");          //запрашиваемая страница
                if (sheet == null) {
                    throw new FileNotFoundException("Отсутствует запрашиваемая страница " );
                } else {


                    for (Row row : sheet) {
                        for (Cell cell : row) {

                            System.out.println(cell.toString() + "\t");
                        }
                        System.out.println();
                    }
                    workbook.close();
                    fileInputStream.close();

                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        else {
            throw new FileNotFoundException("Указан файл с неправильным расширением. Вводимый файл имеет расширение "+file);
    }
        }
private static String getFileExtension(File file) {
    String fileName = file.getName();

    if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf("." ) != 0)

        return fileName.substring(fileName.lastIndexOf(".") +1);

    else return "";
}
}
//}


