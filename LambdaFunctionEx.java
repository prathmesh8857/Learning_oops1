@FunctionalInterface
interface MyInterface{
    void sayHellow();
}

public class LambdaFunctionEx {
    public static void main(String[] args) {
        //Without lambda function
        MyInterface obj1 = new MyInterface() {
            public void sayHellow(){
                System.out.println("Hallow without lambda");
            }
        };
        obj1.sayHellow();

        //with lambda function
        MyInterface obj2 = () -> {
            System.out.println("Hello with lambda");
        };
        obj2.sayHellow();
    }
}
