public class BankAccount {
    private int number;
    private double balance;
    private String Owner;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return Owner;
    }
    public BankAccount(int number,double balance, String owner){
        this.number = number;
        this.balance = balance;
        this.Owner = owner;
    }
    public BankAccount(double initialDeposit) {
        deposit(initialDeposit);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public void displayBalance() {
        System.out.println("Your Balance dear " + Owner +  " in this account " +   number + " two " +  balance + " USD");
    }
}
class accounts {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2, 50.5, "harust");
        account.deposit(10000.0);
        account.withdraw(100.0);
        account.displayBalance();

    }

}