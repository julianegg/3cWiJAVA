package at.dej.OO.BankAccount;

public class SavingAccount extends BaseAccount {



    public double withdraw(double amount){
        if((getBalance()- amount)>0){
            return super.withdraw(amount);
        }else{
            System.out.println("Keine Deckung");
            return 0;
        }
    }
}
