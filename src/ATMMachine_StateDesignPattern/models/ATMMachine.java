package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.state.*;

public class ATMMachine {

    private int atmId;
    private String bankName;
    private ATMState currentState;
    private State state;


    public ATMMachine(int atmId, String bankName) {
        this.atmId = atmId;
        this.bankName = bankName;
        this.currentState = ATMState.READY_FOR_TRANSACTION;
        this.state = new ReadyForTransaction(this);
    }

    public int getAtmId() {
        return atmId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public void initTransaction(){
        state.initTransaction();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public boolean readCardDetailsAndPin(Card card){
        return state.readCardDetailsAndPin(card);
    }
    public int dispenseCash(int transactionId){
        return state.dispenseCash(transactionId);
    }
    public void ejectCard(){
        state.ejectCard();
    }
    public boolean readCashWithdrawDetails(int transactionId, int amount){
        return state.readCashWithdrawDetails(transactionId, amount);
    }

}
