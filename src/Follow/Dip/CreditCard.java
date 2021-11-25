package Follow.Dip;

public class CreditCard implements BankCard{
    public void doTransaction(long amount){
        System.out.println("payment using credit card");
    }
}
