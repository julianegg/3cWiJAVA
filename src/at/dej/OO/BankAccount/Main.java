package at.dej.OO.BankAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(3000);
        ca.deposit(10000);
        ca.withdraw(15000);
        System.out.println(ca.getBalance());


        SavingAccount sa = new SavingAccount();
        sa.deposit(55);
        sa.withdraw(50);
        System.out.println(sa.getBalance());


    }


}
