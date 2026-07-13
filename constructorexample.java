class Employee{

    int Id;
    String Name;
//defa
    Employee(){
        Id = 0;
        Name = "default";
        System.out.println("Default constructor");
    }

    Employee(int id, String name){
        Id = id;
        Name = name;
        System.out.println("parametarised constructor");
}
}
public class constructorexample {

    
    public static void main(String[] args) {
        
        Employee harshit = new Employee();
        System.out.println(harshit.Id);
        System.out.println(harshit.Name);

        Employee harsh = new Employee(1,"harsh");
        System.out.println(harsh.Id);
        System.out.println(harsh.Name);


        
    }
}
