package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.DTO.CreateTransactionRequestDTO;
import ATMMachine_StateDesignPattern.DTO.GetATMAmountRequestDTO;
import ATMMachine_StateDesignPattern.DTO.UpdateATMStateRequestDTO;

public interface BackendAPI {

    int createTransaction(CreateTransactionRequestDTO createTransactionDTO);

    boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO);


    int getATMAMount(GetATMAmountRequestDTO getATMAmountRequestDTO);
}
