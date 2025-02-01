package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.Card;

public class DebitCardManagerService implements CardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        // ideally we should make these also connect to API
        return true;
    }

    @Override
    public boolean validateWithdrawl(Card card, double amount) {
        // ideally we should make these also connect to API
        return true;
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        // ideally we should make these also connect to API
        return true;
    }
}
