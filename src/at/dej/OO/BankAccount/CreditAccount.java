package at.dej.OO.BankAccount;

public class CreditAccount extends BaseAccount{
    public double BalanceRequest(){
        if(getBalance() > -1){
            System.out.println("Kontostand beträgt :" + getBalance());
            return super.getBalance();
        }
        else {
            return 0;


        }
    }

}
