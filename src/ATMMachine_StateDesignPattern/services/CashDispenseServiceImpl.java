package ATMMachine_StateDesignPattern.services;

import ATMMachine_StateDesignPattern.DTO.GetATMAmountRequestDTO;
import ATMMachine_StateDesignPattern.apis.BackendAPI;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.models.ATM;

public class CashDispenseServiceImpl implements CashDispenserService {

    private final BackendAPI backendAPI;

    public CashDispenseServiceImpl() {
        this.backendAPI = new NodeBackendAPI();
    }

    @Override
    public void dispenseCash(ATM atm, int amount) {
        // call the server to dispense the cash
        int atmAmount = this.backendAPI.getATMAMount(new GetATMAmountRequestDTO(atm.getAtmId()));

        if(atmAmount < amount) {
            throw new RuntimeException("ATM does not have enough cash to dispense");
        }

        System.out.println("Dispensing cash: " + amount);

    }
}
