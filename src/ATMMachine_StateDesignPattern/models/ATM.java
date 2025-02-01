package ATMMachine_StateDesignPattern.models;

import ATMMachine_StateDesignPattern.DTO.UpdateATMStateRequestDTO;
import ATMMachine_StateDesignPattern.apis.BackendAPI;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.state.ReadyForTransactionState;
import ATMMachine_StateDesignPattern.state.State;

public class ATM {

    private final String atmId;
    private State state;
    private final BackendAPI backendAPI;

    public ATM(String atmId) {
        this.atmId = atmId;
        this.backendAPI = new NodeBackendAPI();
        this.state = new ReadyForTransactionState(this, this.backendAPI);
    }

    public String getAtmId() {
        return atmId;
    }

    public void changeState(State newState) {
        this.state = newState;
        // now call the server to persist the state on the server also
        this.backendAPI.updateState(new UpdateATMStateRequestDTO(this.atmId, newState.getState()));
    }

}
