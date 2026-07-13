//base class
class Account{
    String accountHolderName;
    double balance;

    void deposite(double amount){
        balance += amount;//balance = balance + amount
        System.out.println("Deposited :" + amount + "new balance : " + balance);


    }


}

class SavingAccount extends Account{
    double interestRate;

    void appyInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("interest applied :" + interest + ". new balance : " + balance);

    }
}


public class singleInheritance {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.accountHolderName = "prathmesh";
        sa.balance = 10000;
        sa.deposite(5000);
        sa.interestRate = 5.0;
        sa.appyInterest();
    }
}
