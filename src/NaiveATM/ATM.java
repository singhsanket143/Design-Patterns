package NaiveATM;

public class ATM {

    // Enum for ATM states
    private enum ATMState {
        IDLE, TRANSACTION_IN_PROGRESS, CARD_INSERTED, AMOUNT_ENTERED, DISPENSING_CASH
    }

    // Instance variables
    private String atmId;         // Unique identifier for the ATM
    private ATMState state;       // Current state of the ATM

    // Constructor
    public ATM(String atmId) {
        this.atmId = atmId;
        this.state = ATMState.IDLE; // Default state is IDLE
    }

    // Start a transaction
    public int startTransaction() {
        if(state == ATMState.TRANSACTION_IN_PROGRESS) {
            throw new IllegalStateException("Transaction already in progress.");
        }
        if(state == ATMState.DISPENSING_CASH) {
            throw new IllegalStateException("Cannot start a new transaction while dispensing cash.");
        }
        if(state == ATMState.CARD_INSERTED) {
            throw new IllegalStateException("Cannot start a new transaction. Card already inserted.");
        }
        state = ATMState.TRANSACTION_IN_PROGRESS;
        int transactionId = generateTransactionId();
        System.out.println("Transaction started with ID: " + transactionId + " on ATM: " + atmId);
        return transactionId;
    }

    // Cancel a transaction
    public void cancelTransaction() {
        if (state == ATMState.IDLE) {
            throw new IllegalStateException("No transaction to cancel.");
        }
        if(state == ATMState.DISPENSING_CASH) {
            throw new IllegalStateException("Cannot cancel transaction while dispensing cash.");
        }
        state = ATMState.IDLE;
        System.out.println("Transaction canceled on ATM: " + atmId);
    }

    // Read card details and validate
    public boolean readCard(String cardType, long cardNumber, int pin) {
        if (state != ATMState.TRANSACTION_IN_PROGRESS) {
            throw new IllegalStateException("Cannot read card. Start a transaction first.");
        }
        state = ATMState.CARD_INSERTED;
        boolean isValid = validateCardDetails(cardType, cardNumber, pin);
        if (!isValid) {
            state = ATMState.IDLE;
        }
        return isValid;
    }

    // Enter withdrawal amount
    public boolean enterAmount(double amount) {
        if (state != ATMState.CARD_INSERTED) {
            throw new IllegalStateException("Card must be inserted before entering an amount.");
        }
        state = ATMState.AMOUNT_ENTERED;
        return checkWithdrawalLimit(amount);
    }

    // Dispense cash
    public void dispenseCash(double amount) {
        if (state != ATMState.AMOUNT_ENTERED) {
            throw new IllegalStateException("Amount must be entered before dispensing cash.");
        }
        state = ATMState.DISPENSING_CASH;
        System.out.println("Dispensing cash: " + amount + " on ATM: " + atmId);
        state = ATMState.IDLE; // Reset state after dispensing
    }

    // Eject card
    public void ejectCard() {
        if (state == ATMState.IDLE) {
            throw new IllegalStateException("No card to eject.");
        }
        state = ATMState.IDLE;
        System.out.println("Card ejected from ATM: " + atmId);
    }

    // Private helper methods
    private int generateTransactionId() {
        return (int) (Math.random() * 100000); // Generate random transaction ID
    }

    private boolean validateCardDetails(String cardType, long cardNumber, int pin) {
        // Simulate card validation
        return true; // Assume valid for simplicity
    }

    private boolean checkWithdrawalLimit(double amount) {
        // Simulate withdrawal limit check
        return amount <= 1000; // Assume a max limit of 1000
    }
}