import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferingEx {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("demo.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

        int data;

        while((data = bis.read()) != -1){
            bos.write(data);
        }
        bos.flush();
        fis.close();
        bis.close();
        fos.close();
        bos.close();

    }catch (IOException e){
        System.out.println("Exception handled: " + e.getMessage());

    }
}
}
