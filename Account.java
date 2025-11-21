import java.util.ArrayList;

class Account {
    String accNo;
    String name;
    double balance;

    Account(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account a) {
        accounts.add(a);
    }

    void removeAccount(Account a) {
        accounts.remove(a);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account("101", "Rafi", 5000);
        bank.addAccount(a1);

        a1.deposit(2000);
        a1.withdraw(1000);

        System.out.println("Final Balance: " + a1.balance);
    }
}