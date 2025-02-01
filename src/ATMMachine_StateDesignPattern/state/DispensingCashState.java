package ATMMachine_StateDesignPattern.state;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.factories.CardManagerFactory;
import ATMMachine_StateDesignPattern.models.ATM;
import ATMMachine_StateDesignPattern.models.Card;
import ATMMachine_StateDesignPattern.services.CardManagerService;
import ATMMachine_StateDesignPattern.services.CashDispenseServiceImpl;
import ATMMachine_StateDesignPattern.services.CashDispenserService;

public class DispensingCashState implements State {
    private final ATM atm;
    private final CashDispenserService cashDispenserService;

    public DispensingCashState(ATM atm) {
        this.atm = atm;
        this.cashDispenserService = new CashDispenseServiceImpl();
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while dispensing cash");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin while dispensing cash");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isTxnSuccessful = manager.doTransaction(card, amount, transactionId);
        if(isTxnSuccessful) {
            this.cashDispenserService.dispenseCash(this.atm, amount);

        } else {
            System.out.println("Something went wrong");
        }
        this.atm.changeState(new EjectingCardState(this.atm));

        return amount;
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while dispensing cash");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details while dispensing cash");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while dispensing cash");
    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSING_CASH;
    }
}
