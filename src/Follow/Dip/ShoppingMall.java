package Follow.Dip;

public class ShoppingMall {
    private BankCard bankCard;
    public ShoppingMall(BankCard bankCard){
        this.bankCard=bankCard;
    }
    public void doPurchase(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

        BankCard bankCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchase(10000);
    }
}
