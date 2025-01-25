package SOLID;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();

}
