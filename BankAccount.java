public class BankAccount {
    private Double balance;

    public BankAccount() {
        BankAccount myBA = new BankAccount();
        //myBA.balance = 0.0;
    }

    public double checkBalance() {
        return this.balance;
    }

    public void add(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }
}