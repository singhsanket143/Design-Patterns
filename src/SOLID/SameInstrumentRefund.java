package SOLID;

public class SameInstrumentRefund implements RefundLogic {

    @Override
    public void doRefund() {

        System.out.println("Refund done in the same instrument");
    }
}
