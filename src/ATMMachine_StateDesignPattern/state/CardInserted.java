package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATMMachine;
import ATMMachine_StateDesignPattern.models.Card;

public class CardInserted implements State {

    ATMMachine atm;
    public CardInserted(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void initTransaction() {

    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        System.out.println("Reading Details");
        System.out.println("Enter Pin");
        atm.setCurrentState(ATMState.READ_CARD_DETAILS_AND_PIN);
        atm.setState(new ReadCardDetails(atm));
        // Validating Pin
        //if valid
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
