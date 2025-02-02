package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.Card;

public class CreditCardManagerService implements CardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        return true;
    }

    @Override
    public boolean validateWithdrawl(int transactionId, double amount) {
        return true;
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        // maybe we could have utilised the methods of card interfaces
        return true;
    }
}
