class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        
         public String getAccountNumber() {
            return accountNumber;
         }
         public double getBalance() {
            return balance;
         }
         public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    }

}
public class EncapsulationEx {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678",1000.0);
        System.out.println("Account Number: "+ account.getAccountNumber());
        System.out.println("balance: "+ account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposite: " + account.getBalance());

        account.Withdraw(500.0);
        System.out.println("Balance after withdrawl: " + account.getBalance());


    }
    
}
