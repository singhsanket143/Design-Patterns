package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.Card;

public class ReadyForTransaction implements State{

    @Override
    public int initTransaction() {
        return 0;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        return 0;
    }

    @Override
    public void ejectCard() {

    }

    @Override
    public boolean readCashWithdrawDetails(int transactionId, int amount) {
        return false;
    }

    @Override
    public ATMState getState() {
        return null;
    }
}
