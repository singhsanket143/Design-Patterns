package ATMMachine_StateDesignPattern.models;

public class Card {

    private final long cardNumber;

    private final int pin;

    private final String name;

    private final String cardType;

    private final String bankName;

    public Card(long cardNumber, int pin, String name, String cardType, String bankName) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
        this.cardType = cardType;
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getCardType() {
        return cardType;
    }

    // toString
    @Override
    public String toString() {
        return "Card{" + "cardNumber=" + cardNumber + ", pin=" + pin + ", name=" + name + ", cardType=" + cardType + ", bankName=" + bankName + '}';
    }
}
