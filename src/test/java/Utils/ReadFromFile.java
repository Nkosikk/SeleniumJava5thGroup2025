package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class ReadFromFile {

    private static String testData = System.getProperty("user.dir")+"/src/test/java/TestData/testData.xlsx";

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

    public static DataFormatter dataFormatter = new DataFormatter();
    static XSSFSheet sheet = workbook.getSheet("login");
    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password =dataFormatter.formatCellValue(sheet.getRow(2).getCell(1));
    @Test
    public void test(){
        System.out.println("username is "+username);
        System.out.println("password is "+password);
    }
}
