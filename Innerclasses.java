// class Outer{

//     int x = 10;

//     class Inner{

//        int y = 5;

//         void display(){
//             System.out.println("x = " + x);
//             System.out.println("y = " + y);
//         }
//     }
// }



// public class Innerclasses {
//     public static void main(String[] args) {
        
//         Outer outer = new Outer();
//         Outer.Inner inner = new Outer.Inner();

//     }
// }



class Outer{

    void show(){

    class Inner{

       int y = 5;

        void display(){
            System.out.println("y = " + y);
        }
    }
    Inner inner = new Inner();
    inner.display();
    }
}



public class Innerclasses {
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        outer.show();
    }
}


//# Inner classes #//
//inner class that define inside the another class 1)one class belong completely to another class 2)inner class is not usefull outside 3)inner class help in code organizaton
//4)provide better security 


//members of inner class can access all outer class members including private veriable and protected veriable

//Type of inner class//
//1)member in a class:-
//2)local inner class:- is a class that is define inside a method