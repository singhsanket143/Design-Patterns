package SOLID;

public class Mastercard extends CreditCard implements RefundCompatibleCC {

    public RefundLogic refundAlgorithm;

    public Mastercard(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Mastercard Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Mastercard Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Mastercard Card tapAndPay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
