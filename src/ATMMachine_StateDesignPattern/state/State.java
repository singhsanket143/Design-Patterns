package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.Card;

public interface State {

    int initTransaction();

    boolean readCardDetailsAndPin(Card card, String pin); // returns true if card is valid and false otherwise

    int dispenseCash(Card card, int amount, int transactionId); // returns the amount dispensed

    void ejectCard();

    boolean readCashWithdrawDetails(Card card, int transactionId, int amount); // returns true if cash withdrawl details are valid and false otherwise

    boolean cancelTransaction(int transactionId); // returns true if transaction is cancelled and false otherwise

    ATMState getState();
}
