package ATMMachine_StateDesignPattern.DTO;

public class GetATMAmountRequestDTO {

    private final String atmId;

    public GetATMAmountRequestDTO(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
