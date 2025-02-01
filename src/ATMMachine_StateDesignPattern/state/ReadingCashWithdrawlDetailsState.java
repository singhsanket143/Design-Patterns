package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.factories.CardManagerFactory;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;
import ATMMachine_StateDesignPattern.services.CardManagerService;

public class ReadingCashWithdrawlDetailsState implements State {

    private final ATM atm;

    public ReadingCashWithdrawlDetailsState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while reading cash withdraw details");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin without inserting card");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isWithdrawlValid = manager.validateWithdrawl(transactionId, amount);
        if(isWithdrawlValid) {
            this.atm.changeState(new DispensingCashState(this.atm));
        } else {
            this.atm.changeState(new ReadyForTransactionState(this.atm));
        }

        return isWithdrawlValid;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CASH_WITHDRAW_DETAILS;
    }
}
