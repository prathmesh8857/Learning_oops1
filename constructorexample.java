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



//using an abstract class like payment for supporting payments type aalows structured code reuse,extancibility(adding new code and extend previous code) and sharedlogic for all payment inplementation 
//-each payment type such as criditcardpayment,upipaymentetc,inherit from the abstract class and provide its own specific processing logic by overriding its abstact method 
//- new payment type can be added letter same link by creating new subclass without changing the core structure making the systum open for extention and close for modification.

//types of access modifier in java
//1)public
//2)private
//3)default
//4)protected
//-acess modifier define the visibility and the accesebility of classes,methods,veriable,constructor.
//-they dertermine where this members can be accsess with in the code
//why use acess modifier
//- security
//- incapsulation
//- controlled access
//- clean design


//# public modifier #
//- it is accessable for anywhere

//# private modifier #
//- it is accessable only inside the same class
//- Scope = 

//# default modifier #
//- it is only accessable with in the same package
//- there is no keyword for default access modifier

//# protected modifier #
//- it is accessable in same packages same class and sub class evan in different classes
//- 



//# incapsulation #//
//- incapsulation is about two things = 1)keeping and object data safe from careless or illigal access and exposing
//  a clean api or code for other to use that object correctly 
//  2) bundle data of code into one unite and restrict derect access to the data using 
//  access modifier tipically by keeping filds private and exposing public 


//# enum #//
//enum means enumaration that means fix sate of constants in java enum is special datatype use to store group of related constants
//-Ex days of weeks,months,directions.
// syntax:
//    enum day{
//     monday
//     tuesday
//     wednesday
//     thursday
//     friday
//     saturday
//     sunday
//    }