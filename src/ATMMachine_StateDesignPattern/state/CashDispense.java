package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATMMachine;
import ATMMachine_StateDesignPattern.models.Card;

public class CashDispense implements State {

    ATMMachine atm;

    public CashDispense(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void initTransaction() {
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {

        atm.setCurrentState(ATMState.DISPENSING_CASH);
        atm.setState(atm.getEjectCardState());
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
