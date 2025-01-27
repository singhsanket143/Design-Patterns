package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATMMachine;
import ATMMachine_StateDesignPattern.models.Card;

public class CashWithDrawal implements State {

    ATMMachine atm;

    public CashWithDrawal(ATMMachine atm) {
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

    }

    @Override
    public boolean readCashWithdrawDetails(int transactionId, int amount) {

        //banking validations and all
        //if all good
        atm.setCurrentState(ATMState.READING_CASH_WITHDRAW_DETAILS);
        atm.setState(new CashDispense(atm));
        return false;
    }

    @Override
    public ATMState getState() {
        return null;
    }
}
