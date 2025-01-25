package SOLID;

public class SameWalletRefund implements RefundLogic {

    @Override
    public void doRefund() {
        System.out.println("Refund done in the same wallet");
    }
}
