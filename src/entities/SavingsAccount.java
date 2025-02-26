package entities;

public class SavingsAccount extends Account {
    private double interestRate;


    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += interestRate;
    }

    //Anotação de sobreposição
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
