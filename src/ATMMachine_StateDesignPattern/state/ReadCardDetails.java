package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATMMachine;
import ATMMachine_StateDesignPattern.models.Card;

public class ReadCardDetails implements State {

    ATMMachine atm;

    public ReadCardDetails(ATMMachine atm) {
        this.atm = atm;
    }
    @Override
    public void initTransaction() {
        System.out.println("Insert Card");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        // validation of Card information


//        if(validateCardDetails(card)){
//
//        }
        atm.setCurrentState(ATMState.READING_CASH_WITHDRAW_DETAILS);
        atm.setState(new CashWithDrawal(atm));

        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        System.out.println("Reading Card Details can't dispense cash");
        return 0;
    }

    @Override
    public void ejectCard() {
        // if pressed cancel transaction
        atm.setCurrentState(ATMState.EJECTING_CARD);
        atm.setState(new EjectCard(atm));
    }

    @Override
    public boolean readCashWithdrawDetails(int transactionId, int amount) {
        System.out.println("Reading Card Details can't read cash withdraw details");
        return false;
    }

    @Override
    public ATMState getState() {
        return null;
    }
}
