package class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        //piece of software to read the EXCEL file, importing from Libraries with the help of pom.xml dependencies
        //e.g. like Properties prop = new Properties();
        // that special call -> L19-> which knows how to read the data from Excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(3);
        System.out.println(row);
        //in excel columns are called -> "cell"
        Cell cell =  row.getCell(2);
        System.out.println(cell);


    }
}



/**
 So, XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis); is like Properties properties = new Properties();
 but instead of load(fis) , XSSFWorkbook takes it from constructor ?

 Yes, you're correct. In the code snippet XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);, the XSSFWorkbook
 constructor is used to create a new instance of the XSSFWorkbook class. The fis parameter represents an input
 stream from which the constructor reads the Excel file.

 Similarly, in the code snippet Properties properties = new Properties();, the Properties class constructor is
 used to create a new instance of the Properties class.

 However, there is a difference in how the data is loaded:

 1. XSSFWorkbook: The XSSFWorkbook constructor takes an input stream (fis) as a parameter, and it reads and parses
    the Excel file data from that input stream. The constructor itself performs the loading of the Excel file data
    into the XSSFWorkbook object.
    The XSSFWorkbook class is part of the Apache POI library, which is an open-source project. The Apache POI
    library provides Java APIs for working with various Microsoft Office file formats, including Excel files.

 2. Properties: In the case of Properties, you typically create an instance using the constructor
    Properties prop = new Properties();. After that, you can load the properties' data from an input stream
    using the load method, such as properties.load(fis);. The load method reads and interprets the data from the
    input stream and populates the Properties object with the key-value pairs.
    The Properties class is part of the Java Standard Library (JSL) and is provided by Oracle as part of the Java
    Development Kit (JDK). It is a built-in class in Java that allows you to manage key-value pairs as configuration
    data.

 So, while both XSSFWorkbook and Properties use constructors to create instances, the difference lies in how the
 data is loaded. For XSSFWorkbook, the data is loaded directly in the constructor, while for Properties, the data
 is loaded separately using the load method.







 */