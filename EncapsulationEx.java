class BankAccount{
    private String accountnumber;
    private double balance;

    public BankAccount(String accountnumber,double balance){
        this.accountnumber = accountnumber;
        this.balance = balance;
         public String getAccountNumber() {
            return accountnumber;
         }
         public double getbalance() {
            return balance;
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
