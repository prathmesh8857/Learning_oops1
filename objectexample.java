// class Dog{
// String name;

//     void bark(){
//         System.out.println(name + "barking");
//     }
// }   



// public class objectexample {
    
//     public static void main(String[] args){
//     Dog obj = new Dog();
//     obj.name = "Rockey ";
//     obj.bark();
    
// }
// }


class BankAccount {
    String Name;
    int AccountNumber;
    double Balance;

    public void Deposit(double amount) {
        Balance += amount;
        }

    public void withdraw(double amount) {
        if(amount <= Balance) {
            Balance -= amount;
        }else {
            System.out.println("insufficient funds");
        }
    }
    public double GetBalance() {
return Balance;
    }
    
}

public class objectexample {

    public static void main(String[] args) {
        
    }
}