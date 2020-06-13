package encapsulation;

public class BankAccount {
    /*
    Create a new class for a bank account
    Create fields for the account number, balance, customer name, email and phone number.
    Create getters and setters for each field
    Create two additional methods
    1. To allow the customer to deposit funds (this should increment the balance field).
    2. To allow the customer to withdraw funds. This should deduct from the balance field,
    but not allow the withdrawal to complete if their are insufficient funds.
    You will want to create various code in the Main class (the one created by IntelliJ) to confirm your code is working.
    Add some System.out.println's in the two methods above as well.
     */
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositMoney(double deposit) {
        balance += deposit;
        System.out.println("You deposited $" + deposit + " to your account. Your updated deposit is $ "+ balance);

    }

    public void withdrawMoney(double withdraw) {
        if (withdraw > balance) {
            System.out.println("You have insufficient funds to complete this transaction");
        } else {
            balance -= withdraw;
            System.out.println("You withdrew $"+ withdraw+ " and your updated balance is $ " + balance);
        }

    }

    public static void main(String[] args) {
        BankAccount aras=new BankAccount();
        aras.depositMoney(1250);
        aras.depositMoney(345);
        aras.withdrawMoney(123.76);

    }
}
