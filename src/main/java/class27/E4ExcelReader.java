package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        //piece of software to read the EXCEL file, importing from Libraries with the help of pom.xml dependencies
        //e.g. like Properties properties = new Properties();
        // that special call which knows how to read the data from Excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);

        //int rowSize = sheet.getPhysicalNumberOfRows();
        for (int rows = 0; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row = sheet.getRow(rows);
        // int colSize = row.getPhysicalNumberOfCells();
            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                System.out.print(row.getCell(col) + " ");
            }
            System.out.println();
        }
        Row row = sheet.getRow(0);
/** xls doesn't have int value when  XSSFWorkbook designed, it always return the double value*/
        /* initial idea of reading from xls sheet
        System.out.println(row.getCell(0 )+ " ");
        System.out.println(row.getCell(1)+ " ");
        System.out.println(row.getCell(2)+ " ");
        System.out.println(row.getCell(3)+ " ");
        System.out.println(row.getCell(4)+ " ");*/
        //in excel columns are called -> "cell"


    }
}


/**
 * so, XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis); is like Properties properties = new Properties();
 * but instead of load(fis) , XSSFWorkbook takes it from constructor ?
 * <p>
 * Yes, you're correct. In the code snippet XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);, the XSSFWorkbook
 * constructor is used to create a new instance of the XSSFWorkbook class. The fis parameter represents an input
 * stream from which the constructor reads the Excel file.
 * <p>
 * Similarly, in the code snippet Properties properties = new Properties();, the Properties class constructor is
 * used to create a new instance of the Properties class.
 * <p>
 * However, there is a difference in how the data is loaded:
 * <p>
 * 1. XSSFWorkbook: The XSSFWorkbook constructor takes an input stream (fis) as a parameter, and it reads and parses
 * the Excel file data from that input stream. The constructor itself performs the loading of the Excel file data
 * into the XSSFWorkbook object.
 * <p>
 * 2. Properties: In the case of Properties, you typically create an instance using the constructor
 * Properties properties = new Properties();. After that, you can load the properties data from an input stream
 * using the load method, such as properties.load(fis);. The load method reads and interprets the data from the
 * input stream and populates the Properties object with the key-value pairs.
 * <p>
 * So, while both XSSFWorkbook and Properties use constructors to create instances, the difference lies in how the
 * data is loaded. For XSSFWorkbook, the data is loaded directly in the constructor, while for Properties, the data
 * is loaded separately using the load method.
 */