package homework0807.payment;

public class Client implements Payment{
    private final int bankAcc;
    private final String accOwner;
    private final double amm;

    public Client(int bankAcc, String accOwner, double amm) {
        this.bankAcc = bankAcc;
        this.accOwner = accOwner;
        this.amm = amm;
    }

    @Override
    public int bankAccount() {
        return bankAcc;
    }

    @Override
    public String accountOwner() {
        return accOwner;
    }

    @Override
    public double amount() {
        return amm;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Bank Account=" + bankAcc +
                ", Account Owner='" + accOwner + '\'' +
                ", Ammount=" + amm +
                '}';
    }
}
