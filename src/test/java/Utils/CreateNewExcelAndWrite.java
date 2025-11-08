package Utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateNewExcelAndWrite {

    public static void main(String[] args) {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet
        Sheet sheet = workbook.createSheet("Employees");

        // Create a row (index 0 = first row)
        Row header = sheet.createRow(0);

        // Create header cells
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Department");

        // Create some data rows
        Object[][] data = {
                {1, "Alice", "HR"},
                {2, "Bob", "Legal"},
                {3, "Charlie", "IT"}
        };

        int rowNum = 1; // Start after header
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String)
                    cell.setCellValue((String) field);
                else if (field instanceof Integer)
                    cell.setCellValue((Integer) field);
            }
        }

        // Auto-size the columns
        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write to file
        try (FileOutputStream fileOut = new FileOutputStream("employees.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
