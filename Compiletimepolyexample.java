class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    
    
    //public double add(double a, double b){
        //return a+ b;
    //}

    public void add(double a,double b){
        System.out.println("sum of doubles:" +(a+b));
    }
    public void add(double a,double b,double c){
        System.out.println("sum of doubles:" +(a+b+c));
    }

    public int add(int...numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }


}

public class Compiletimepolyexample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 10);
        System.out.println("sum of integer: " + sumInt);

        //double sumdouble = calculator.add(5, 10);
        //System.out.println("sum of integer: " + sumdouble);

        calculator.add(5.5,10.2);
        calculator.add(5.5,10.2,15.8);

        int sumVarArgs = calculator.add(1,2,3,4,5);
        System.out.println("Sum of variable argument:" + sumVarArgs);

    }
    
}
