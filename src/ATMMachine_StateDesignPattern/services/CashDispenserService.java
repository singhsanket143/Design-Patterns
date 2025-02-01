package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.models.ATM;

public interface CashDispenserService {

    public void dispenseCash(ATM atm, int amount);
}
