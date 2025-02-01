package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.Card;

public interface CardManagerService {

    boolean validateCard(Card card, String pin);

    boolean validateWithdrawl(Card card, double amount);

    boolean doTransaction(Card card, double amount, int transactionId);

}
