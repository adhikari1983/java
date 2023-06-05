package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class E1CreateExcelFile {
    public static void main(String[] args) throws IOException {
        //1)Software  2)Path  3)Store the file
        String path = System.getProperty("user.dir")+ "\\Files\\TestExcelFile.xlsx";

        //1) software is ready to write
       /** FileInputStream fis = new FileInputStream(path);                after creating the file, to re-write */
       /** XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);              after creating the file, to re-write */
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
       //very first time we do ->  xssfWorkbook.createSheet("Sheet1");
       // creating the sheet on xlsx file
        Sheet sheet = xssfWorkbook.createSheet("Sheet1");

       /** Sheet sheet = xssfWorkbook.getSheet("Sheet1");                  after creating the file, to re-write */
       // selecting the row
        Row row = sheet.createRow(0);

        //setting the column/cell
        Cell cell = row.createCell(1);
        cell.setCellValue("Kiran");
        Cell cell1 = row.createCell(2);
        cell1.setCellValue("Adhikari");

        /** Row row1 = sheet.createRow(1);                                 after creating the file, to re-write */
        /** row1.createCell(1).setCellValue("Parbati");                    after creating the file, to re-write */
        /** row1.createCell(2).setCellValue("Poudel");                     after creating the file, to re-write */

        //2) path used when we have to create the new file
        FileOutputStream fio = new FileOutputStream(path);

        //3) write
        xssfWorkbook.write(fio);

        System.out.println("File is written.............");


    }
}
