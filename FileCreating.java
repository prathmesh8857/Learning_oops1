import java.io.File;
import java.io.IOException;

public class FileCreating {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\github_project\\Learning_oops1");

            File parentFolder = file.getParentFile();
            if(parentFolder != null && !parentFolder.exists()) {
                parentFolder.mkdirs();
            }
            if(file.createNewFile()) {
                System.out.println("File created successfully");
            }else{
                System.out.println("File already Exist");
            }
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Exists: " + file.exists());
            System.out.println("Readible: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        }catch(IOException e){
            System.out.println("Error while creatinf file: "+ e.getMessage());
        }
    }
}
