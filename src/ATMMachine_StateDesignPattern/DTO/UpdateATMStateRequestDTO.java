package ATMMachine_StateDesignPattern.DTO;

import ATMMachine_StateDesignPattern.Enums.ATMState;

public class UpdateATMStateRequestDTO {

    private final String atmId;
    private final ATMState state;

    public UpdateATMStateRequestDTO(String atmId, ATMState state) {
        this.atmId = atmId;
        this.state = state;
    }

    public String getAtmId() {
        return atmId;
    }

    public ATMState getState() {
        return state;
    }
}
