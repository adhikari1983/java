package utils;

public class Constants {
    //@static -> no object needed to call
    // no object creation means saving the memory
    public static final String CONFIG_READER_PATH =
                                System.getProperty("user.dir") + "\\" + "Files\\Config.properties";

    public static final String EXCEL_FILE_PATH =
                                System.getProperty("user.dir") + "\\Files\\Employees.xlsx";
}
