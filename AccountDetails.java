// Save this as: AccountDetails.java
class Account {
    String accountNumber;
    String accountHolder;

    void setDetails(String number, String holder) {
        accountNumber = number;
        accountHolder = holder;
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

class SavingsAccount extends Account {
    double balance;

    void setBalance(double bal) {
        balance = bal;
    }

    void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}

public class AccountDetails {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setDetails("123456789", "Alice");
        sa.setBalance(1500.75);

        sa.showDetails();
        sa.showBalance();
    }
}
