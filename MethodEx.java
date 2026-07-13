class Employee{


    public double Add(int num1,double num2) {
        double result = num1 + num2;
        return result;
    }
}

public class MethodEx {
    public static void main(String[] args) {
        System.out.println("Main Method Started");


        Employee Harsh = new Employee();
        Harsh.Add(10,25.5);
        double result = Harsh.Add(10,25.5);
        System.out.println("Result :"+ result);
        
    }
}
