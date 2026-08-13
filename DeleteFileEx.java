// import java.io.File;

// public class DeleteFileEx {
//     public static void main(String[] args) {
//         File file = new File("data.txt");
//         if(file.exists()){
//             if(file.delete()){
//                 System.out.println("Delete Successfully");
//             }else{
//                 System.out.println("Unable to delete");
//             }
//         }else{
//             System.out.println("file not found");
//         }
//     }
// }

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFileEx {
     public static void main(String[] args) {
        try{
            Files.delete(Path.of("C:\\Users\\HP\\Pictures\\dawoood.x-20231130-0010 - Copy.jpg"));
            System.out.println("File Deleted");
        }catch(IOException e){
            System.out.println("Error deleting File: " + e.getMessage());
        }
     }
    }    