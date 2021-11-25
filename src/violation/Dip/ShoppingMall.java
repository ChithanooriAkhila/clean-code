package violation.Dip;

public class ShoppingMall {
    private DebitCard debitCard;
    public ShoppingMall(DebitCard debitCard){
        this.debitCard=debitCard;
    }
    public void doPurchase(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        shoppingMall.doPurchase(10000);
    }
}
