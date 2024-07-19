import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args)  {
        try {
            System.out.println("before reading this");
            readFile("C:\\Users\\izama\\Desktop\\JavaCourse\\Java\\src\\textt.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
