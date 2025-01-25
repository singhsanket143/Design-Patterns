package SOLID;

public class Amex extends CreditCard implements RefundCompatibleCC {

    public RefundLogic refundAlgorithm;

    public Amex(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Amex Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Amex Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Amex Card tapAndPay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
