package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.DTO.CreateTransactionRequestDTO;
import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.apis.BackendAPI;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;

public class ReadyForTransactionState implements State {

    private final ATM atm;
    private final BackendAPI backendAPI;

    public ReadyForTransactionState(ATM atm, BackendAPI backendAPI) {
        this.atm = atm;
        this.backendAPI = backendAPI;
    }

    @Override
    public int initTransaction() {
        CreateTransactionRequestDTO createTransactionDTO = new CreateTransactionRequestDTO(this.atm.getAtmId());

        int transactionId = this.backendAPI.createTransaction(createTransactionDTO);

        if(transactionId == 0) {
            throw new RuntimeException("Transaction could not be created");
        }

        // Now that we have the transactionId from the backend, we should move the ATM to the next state
        this.atm.changeState(new ReadCardDetailsAndPinState());
        return transactionId;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        throw new IllegalStateException("Cannot read card details and pin without inserting card");
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading card details and pin");
    }

    @Override
    public void ejectCard() {
    throw new IllegalStateException("Cannot eject card without reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawDetails(int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details without reading card details and pin");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}
