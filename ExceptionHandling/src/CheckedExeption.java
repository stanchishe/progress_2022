import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExeption {
    public static void main(String[] args)
            throws FileNotFoundException
    {
        try {
            FileInputStream fileInput = new FileInputStream("..\\Desktop\\newFile.txt");
        } catch (FileNotFoundException ex1) {
            System.out.println("The provided file was not found!" + ex1.getCause());
        } finally {
            System.out.println("Provide a different file or check if it exists!");
        }
    }
}
