package at.dej.OO.BankAccount;

import java.sql.SQLOutput;

public class CheckingAccount extends BaseAccount{
    private int limit;

    public CheckingAccount(int limit){
        this.limit = limit;
    }

    public double withdraw(double amount){
        if((getBalance() - amount) > (limit * -1)){
            System.out.println("Withdraw:" + amount + "Euros");
            return super.withdraw(amount);
        }else {
            System.out.println("leider keine Deckung");
            return 0;
        }
    }

}
