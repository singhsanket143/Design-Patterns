package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.models.ATMMachine;
import ATMMachine_StateDesignPattern.models.Card;


/**
 * Represents the "Ready for Transaction" state of an ATM machine.
 * In this state, the ATM waits for the user to insert a card to initiate a transaction.
 *
 * Implements the {@link State} interface to define the behavior specific to this state.
 */
public class ReadyForTransaction implements State{

    ATMMachine atm;
    public ReadyForTransaction(ATMMachine atm) {
        this.atm = atm;
    }
    @Override
    public void initTransaction() {
        System.out.println("Insert Card");
        // logic to initiate a transaction after a card is inserted

        // user presses start transaction change the state to
        atm.setCurrentState(ATMState.INSERTED_CARD);
        atm.setState(new CardInserted(atm));
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        System.out.println("Insert Card to initiate a transaction");
        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        System.out.println("Cant dispense cash as in ready state for transaction Please Enter Card");
        return 0;
    }

    @Override
    public void ejectCard() {
        System.out.println("No Card Inserted");
    }

    @Override
    public boolean readCashWithdrawDetails(int transactionId, int amount) {
        System.out.println("No Card Inserted");
        return false;
    }

    @Override
    public ATMState getState() {
        return this.atm.getCurrentState();
    }
}
