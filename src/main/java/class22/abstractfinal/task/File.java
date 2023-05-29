/*
Create a class File that will have the following behaviors: open, edit, close.
and also fields like name and size too.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses:
JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc.
 */
package class22.abstractfinal.task;

public abstract class File {
    private String name;
    private  double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    void printInfo() {
        System.out.println(name + " " + size);
    }

    abstract void open();

    void edit() {
        System.out.println("Edit from File.");
    }

    void close() {
        System.out.println("Closing the File");
    }

}

class JavaFile extends File {

    public JavaFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text.");
    }

    @Override
    void edit() {
        System.out.println("Edit from Java File.");
    }

    @Override
    void close() {
        System.out.println("Closing the Java File");
    }
}

class WordFile extends File {

    public WordFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text.");
    }

    @Override
    void edit() {
        System.out.println("Edit from Word File.");
    }

    @Override
    void close() {
        System.out.println("Closing the Word File");
    }
}

class PdfFile extends File {

    public PdfFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open .pdf file we need Adobe Acrobat.");
    }

    @Override
    void edit() {
        System.out.println("Edit from PDF File.");
    }

    @Override
    void close() {
        System.out.println("Closing the PDF File");
    }

    public static void main(String[] args) {
        File[] files = {
                new JavaFile("file1", 2.5),
                new WordFile("file2", 3.2),
                new PdfFile("file3", 5.2)
        };

        for (File file : files) {
            file.printInfo();
            file.open();
            file.edit();
            file.close();
            System.out.println();
        }
    }
}

