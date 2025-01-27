package ATMMachine_StateDesignPattern;

import ATMMachine_StateDesignPattern.models.ATMMachine;

public class Main {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(1, "SBI");
        atmMachine.initTransaction();
    }
}
