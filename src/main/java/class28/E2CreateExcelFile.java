package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2CreateExcelFile {

    public static void main(String[] args) throws IOException {
        String path = "Files\\Employees.xlsx";

        /** writing on the existing file*/
        //we use FileInputStream to read the existing data
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        Row row = sheet.createRow(1);
        row.createCell(0).setCellValue("Parbati");
        row.createCell(1).setCellValue("Sano");
        row.createCell(2).setCellValue("Poudel");

        // creates an empty File under Files package
        FileOutputStream fio = new FileOutputStream(path);
        // data is written to that File
        xssfWorkbook.write(fio);

        System.out.println("File is written.............");
    }
}
