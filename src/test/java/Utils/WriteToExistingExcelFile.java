package Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WriteToExistingExcelFile {

    public static String testData = System.getProperty("user.dir")+"/src/test/java/TestData/testData.xlsx";

    public static void main(String[] args) {
        String filePath = testData;

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Find the last used row
            int lastRowNum = sheet.getLastRowNum();

            // Create a new row after the last one
            Row newRow = sheet.createRow(lastRowNum + 1);

            // Add some data
            newRow.createCell(0).setCellValue(4);
            newRow.createCell(1).setCellValue("Dion");
            newRow.createCell(2).setCellValue("Marketing");

            // Close input stream before writing (important)
            fis.close();

            // Write changes back to the same file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
                System.out.println("New data added successfully!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
