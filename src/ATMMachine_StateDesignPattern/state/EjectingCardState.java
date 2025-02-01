package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;

public class EjectingCardState implements State{

    private final ATM atm;

    public EjectingCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while ejecting card");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin while ejecting card");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while ejecting card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected, please take it");
        this.atm.changeState(new ReadyForTransactionState(this.atm));
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details while ejecting card");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while ejecting card");
    }

    @Override
    public ATMState getState() {
        return ATMState.EJECTING_CARD;
    }
}
