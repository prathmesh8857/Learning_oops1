import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatingFileusingPath {
    public static void main(String[] args) {
        try{
            Path path = Path.of("Modernfile.txt");

            Files.createFile(path);

            System.out.println("File Crated Successfully.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
