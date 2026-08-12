import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("sample.txt");
            if(file.createNewFile()){
                System.out.println("File created successfully: " + file.getName());
            }else{
                System.out.println("file already exist");
            }
        }catch(IOException e){
            System.out.println("An error occured while creating a file");
            e.printStackTrace();
        }
    }
}
