package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.state.*;

public class ATMMachine {

    private int atmId;
    private String bankName;
    private ATMState currentState;
    private State state;
    private ReadyForTransaction readyForTransactionState;
    private CardInserted cardInsertedState;
    private ReadCardDetails readCardDetailsState;
    private CashWithDrawal cashWithDrawalState;
    private EjectCard ejectCardState;
    private CashDispense cashDispenseState;



    public ATMMachine(int atmId, String bankName) {
        this.atmId = atmId;
        this.bankName = bankName;
        this.currentState = ATMState.READY_FOR_TRANSACTION;
        this.state = new ReadyForTransaction(this);
        this.readyForTransactionState = new ReadyForTransaction(this);
        this.readCardDetailsState = new ReadCardDetails(this);
        this.ejectCardState = new EjectCard(this);
        this.cashDispenseState = new CashDispense(this);
        this.cardInsertedState = new CardInserted(this);
        this.cashWithDrawalState = new CashWithDrawal(this);
    }

    public CashWithDrawal getCashWithDrawalState() {
        return cashWithDrawalState;
    }

    public void setCashWithDrawalState(CashWithDrawal cashWithDrawalState) {
        this.cashWithDrawalState = cashWithDrawalState;
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

    public CardInserted getCardInsertedState() {
        return cardInsertedState;
    }

    public void setCardInsertedState(CardInserted cardInsertedState) {
        this.cardInsertedState = cardInsertedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ReadyForTransaction getReadyForTransactionState() {
        return readyForTransactionState;
    }

    public void setReadyForTransactionState(ReadyForTransaction readyForTransactionState) {
        this.readyForTransactionState = readyForTransactionState;
    }

    public ReadCardDetails getReadCardDetailsState() {

        return readCardDetailsState;
    }

    public void setReadCardDetailsState(ReadCardDetails readCardDetailsState) {
        this.readCardDetailsState = readCardDetailsState;
    }

    public EjectCard getEjectCardState() {
        return ejectCardState;
    }

    public void setEjectCardState(EjectCard ejectCardState) {
        this.ejectCardState = ejectCardState;
    }

    public CashDispense getCashDispenseState() {
        return cashDispenseState;
    }

    public void setCashDispenseState(CashDispense cashDispenseState) {
        this.cashDispenseState = cashDispenseState;
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
