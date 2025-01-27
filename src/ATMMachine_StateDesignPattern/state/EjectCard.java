package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATMMachine;
import ATMMachine_StateDesignPattern.models.Card;

public class EjectCard implements State {

    ATMMachine atm;

    public EjectCard(ATMMachine atm) {
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
        return 0;
    }

    @Override
    public void ejectCard() {
        atm.setCurrentState(ATMState.READY_FOR_TRANSACTION);
        atm.setState(new ReadyForTransaction(atm));

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
