import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx {
    public static void main(String[] args) {
        
        try{
            Reader reader = new FileReader("output.txt");
            int data;
            while((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e){
            System.out.println("Exception Handeled: " + e.getMessage());
        }
    }
}
