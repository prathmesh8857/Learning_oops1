import java.io.FilePermission;

public class FilePermissionEx {
    public static void main(String[] args) {
        FilePermission  permission = new FilePermission("CSS Notes", "read");

        System.out.println("File: " + permission.getName());
        System.out.println("Action: " + permission.getActions());
    }
}
