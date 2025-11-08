package Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class UpdateExcelExample {

    public static String testData = System.getProperty("user.dir")+"/src/test/java/TestData/testData.xlsx";

    public static void main(String[] args) {
        String filePath = testData;

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // get first sheet

            // Loop through rows to find the one containing "Bob"
            for (Row row : sheet) {
                Cell nameCell = row.getCell(1); // column B (Name)
                if (nameCell != null && "Bob".equalsIgnoreCase(nameCell.getStringCellValue())) {
                    Cell deptCell = row.getCell(2); // column C (Department)
                    if (deptCell == null) {
                        deptCell = row.createCell(2);
                    }
                    deptCell.setCellValue("Legal"); // update value
                    System.out.println("Updated Bob's department to Operations.");
                    break;
                }
            }

            // Close input stream before writing back
            fis.close();

            // Write the updated workbook back to the same file
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
                System.out.println("Excel file updated successfully!");
            }

            workbook.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

