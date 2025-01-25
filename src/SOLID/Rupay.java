package SOLID;

public class Rupay extends CreditCard implements RefundCompatibleCC {

    public RefundLogic refundAlgorithm;

    public Rupay(RefundLogic refundAlgorithm) {
        this.refundAlgorithm = refundAlgorithm;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay Card swipeAndPay");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay Card onlinePayment");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay Card tapAndPay");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }
}
