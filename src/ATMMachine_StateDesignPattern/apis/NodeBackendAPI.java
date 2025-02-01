package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.DTO.CreateTransactionRequestDTO;
import ATMMachine_StateDesignPattern.DTO.UpdateATMStateRequestDTO;

public class NodeBackendAPI implements BackendAPI {
    // Should be only responsible for connecting to the backend and returning the response

    public int createTransaction(CreateTransactionRequestDTO createTransactionDTO) {
        // 1. Validations
//        if(createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty()) {
//            throw new IllegalArgumentException("ATM ID cannot be null or empty");
//        }

        // 2. Connect to the backend
        // To mimic the backend call let's return a new random transaction ID

        // 3. Return the response
        return (int) (Math.random() * 1000);
    }

    @Override
    public boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO) {

        // Assume that there is the implementation that calls the backend to update the state of the ATM

        return true; // mimiced response
    }

}
