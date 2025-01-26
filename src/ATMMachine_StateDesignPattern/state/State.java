package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.Card;

public interface State {

    int initTransaction();

    boolean readCardDetailsAndPin(Card card); // returns true if card is valid and false otherwise

    int dispenseCash(int transactionId); // returns the amount dispensed

    void ejectCard();

    boolean readCashWithdrawDetails(int transactionId, int amount); // returns true if cash withdrawl details are valid and false otherwise

    ATMState getState();
}
