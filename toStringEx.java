class Employee{

    int id;
    String name;

    public String toString() {
        return "Employee ID: " + id + ", name: " + name;
    }
}

public class toStringEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "rejesh";
        System.out.println(emp1);
    }
}



