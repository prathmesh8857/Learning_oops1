class Outer{

    static int data = 10;

    static class Inner{
        void Display(){
            System.out.println("Data is: "+ data);
        }
    }
}

//main class

public class AnonymusClassesExample {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.Display();
    }
}

   //  ineer class usability //
//use only inside a outer class
//improve redability


   // when avoid inner class //
//inner class is reusable avoid in
//avoid when used by multiple modules
