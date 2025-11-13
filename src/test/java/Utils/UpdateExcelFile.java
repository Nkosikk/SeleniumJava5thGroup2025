package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UpdateExcelFile {

    private static String testData = System.getProperty("user.dir")+"/src/test/java/TestData/testData.xlsx";

    public static void main(String[] args) {

        String filePath = testData;

        try (FileInputStream fis = new FileInputStream(filePath);

             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Access the first sheet

            // Loop through rows and cells to read data
            for (Row row : sheet) {
                Cell cellName = row.getCell(0);// Assuming names are in the second column (index 0)
                if (cellName != null && "sbuda@gmail.com".equals(cellName.getStringCellValue())) {
                    Cell cellStatus = row.getCell(1); // Assuming status is in the third column (index 1)
                    if (cellStatus == null) {
                        cellStatus = row.createCell(1);
                    }
                    cellStatus.setCellValue("PasswordChanged");
                    break; // Exit loop after updating
                }
            }

            // Close input stream before writing back
            fis.close();

            // Write the updated workbook back to the file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }

            workbook.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
