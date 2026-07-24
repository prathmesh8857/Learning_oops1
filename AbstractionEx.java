//To create absctact class use abstract keyword abstact class are incomplete bcoz abstract method created by using abstract keyword and when we create abstarct method we dont have implementation means incomplete, we cannot create instance of abstract class.
//
//abstract class we should provide implementation for the abstract method else we get error.
//if class inherits as abstract class then there are two option for that class 1)provide implementation for all abstract members from the base abstact class 2)use class does not wish to provide implementation for all the abstract menber innherited from the abstract class then the class as to make as abstract

//Abstract class example

// // without abstract class //
// class Car{
//     int Noofwheels = 4;

//     void DisplayTyre() {
//         System.out.println("Number Of Tyres Are " + Noofwheels + ".");
//     }

//     void start() {
//         System.out.println("Car Is Start On Buttun.");
//     }
// }

// class Bike{
//     int NoOfWheels = 2;

//     void DisplayTyre() {
//         System.out.println("Number Of Tyres Are " + NoOfWheels + ".");
//     }

//     void start() {
//         System.out.println("Bike Is Start By Kick.");
//     }
// }
// public class AbstractionEx {
//     public static void main(String[] args) {
        
//         Car car = new Car();
//         car.DisplayTyre();
//         car.start();

//         Bike bike = new Bike();
//         bike.DisplayTyre();
//         bike.start();
//     }
// }

// // with abstract class //
abstract class Vehicle {
    int  Noofwheels;

    void DisplayTyre() {
        System.out.println("Number Of Tyres Are " + Noofwheels + ".");
    }

    abstract void start();
}
class Car extends Vehicle{

    void start() {
        System.out.println("Car Is Start On Buttun.");
    }
}

class Bike extends Vehicle{

    void start() {
        System.out.println("Bike Is Start By Kick.");
    }
}
public class AbstractionEx {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        car.Noofwheels = 4;
        car.DisplayTyre();
        car.start();

        Vehicle bike = new Bike();
        bike.Noofwheels = 2;
        bike.DisplayTyre();
        bike.start();
    }
}