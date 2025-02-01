package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Enums.CardType;
import ATMMachine_StateDesignPattern.models.Card;

public class ReadCardDetailsAndPinState implements State {

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while reading card details and pin");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        if(card.getCardType().equals(CardType.DEBIT)) {

        } else if (card.getCardType().equals(CardType.CREDIT)) {

        }
        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawDetails(int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details while reading card details and pin");
    }

    @Override
    public ATMState getState() {
        return ATMState.READ_CARD_DETAILS_AND_PIN;
    }
}
