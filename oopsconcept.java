// //object oriented programming.

// 1)class
// 2)object
// 3)ketwords
// 4)inheritance
// 5)polymorphism
// 6)abstraction
// 7)encapsulation

// #Advantages od oops
// 1)improve redaibility
// 2)easy to reuse
// 3)to hide complex detail(abstraction) or (encapsulation)
// 4)parent child relationship(inheritance)
// 5)one method many uses(polymorphism)
// 6)simply complex system

// #Disadvantage of oops
// 1)slower performance
// 2)overcopmlicating simple task
// 3)west of memory for small projects
// 4)little bit hard to learn



//   ## CLASS ##

// # Definition of class:
// - class consists of state and baheviour of an object.

// ->state : 1)properties
//           2)attributes
//           3)filds

// ->behavier of object : 1)method

// - class encapsulate data and method in a single unit.
// - class dosn't allowcate memory unit and object is created.
// - an object cannot exist without class but class can exist without any object ->reason: bcoz class is acompile concept stored in metadata
// -Syntax:

//     Accesssmod . class .classname
//     {
//         //method, constructor, fields
//     }

// - Access modifier are public,private,protected,default.
// - class is always starts with capital letter

//  ## OBJECT ##
//- object is a instance of a class that has state and behaviour
//- thik of class is like recopy book and object is the actual thing created
//- object occupy a memory.
//- object is a runtime entity.
//    -> bcoz it is created , manipulated , and managed during the execution of program
//object is created usng (new) keyword.
//(new) keyword allowcate memory on the heap memory and call the constructor



 class Employee{

    int Id;
    double Salary;

    Employee(int Id, double Salary){
        this.Id = Id;
        this.Salary = Salary;
        System.out.println("paramatrized constructor");
    }

    Employee(Employee emp ){
        this.Id = emp.Id;
        this.Salary = emp.Salary;
        System.out.println("copy constructor");
    }

     void display(){
         System.out.println("Id: "+ Id + "Salary: " + Salary);
     }
}

public class oopsconcept {

    
    public static void main(String[] args) {
        
       Employee Harsh = new Employee(1,10000.0);
        System.out.println(Harsh.Id);
        System.out.println(Harsh.Salary );
       Employee copyHarsh = new Employee(Harsh);

       Harsh.display();
       copyHarsh.display();


        
    }
}
                    


