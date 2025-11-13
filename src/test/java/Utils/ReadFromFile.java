package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class ReadFromFile {

    private static final String testData = System.getProperty("user.dir")+"/src/test/java/TestData/testData.xlsx";

    static FileInputStream fs;

    static {
        try {
            fs = new FileInputStream(testData);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;
    static {
        try {
            workbook = new XSSFWorkbook(fs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFSheet sheet = workbook.getSheet("login");
    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(2).getCell(1).getStringCellValue();
//    public static Integer password = (int) sheet.getRow(2).getCell(1).getNumericCellValue();


}
