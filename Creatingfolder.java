import java.io.File;

public class Creatingfolder {
    public static void main(String[] args) {
        try{
            File folder = new File("sample");
            if(folder.mkdir()){
                System.out.println("File created successfully: " + folder.
                getAbsolutePath());
            }else {
                System.out.println("File is Already Exist");
                System.out.println("File Altrady exust at location: " + folder.
                getAbsolutePath());
            }
        }catch(Exception e){
            System.out.println("An Error occured while creating the file.");
            e.printStackTrace();
        }
    }
}
