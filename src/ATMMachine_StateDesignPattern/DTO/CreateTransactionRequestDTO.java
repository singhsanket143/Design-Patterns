package ATMMachine_StateDesignPattern.DTO;

public class CreateTransactionRequestDTO {

        private final String atmId;

        public CreateTransactionRequestDTO(String atmId) {
            this.atmId = atmId;
        }

        public String getAtmId() {
            return atmId;
        }

}
