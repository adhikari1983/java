package class20overriding.mainoverloading;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainOverloading {
    public static void main(String[] args) {
        main();
        main(5);
    }

    public static void main() {
        System.out.println("No parameter main method");
    }

    public static void main(int number) {
        System.out.println("Parameterized main method");
    }
    Workbook workbook = new XSSFWorkbook();
}
