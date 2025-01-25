package SOLID;

public class Visa extends CreditCard implements RefundCompatibleCC {

    public RefundLogic refundAlgorithm;

    public Visa(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Visa Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Visa Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa Card tapAndPay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
