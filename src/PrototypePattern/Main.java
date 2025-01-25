package PrototypePattern;

public class Main {

    public static void main(String[] args) {
        Email e1 = new Email("hello@world.com", "", "Test email", "This is a test email");

        // Create a copy object
        Email e2 = e1.copy(); // this is calling the copy constructor
        e2.setBody("");

        e2.displayEmail();

        PremiumEmail pe1 = new PremiumEmail("hellopremium@world.com", "", "Test premium email", "This is a test premium email", "cc", "bcc");

        // Create a copy object
        PremiumEmail pe2 = pe1.copy(); // this is calling the copy constructor


    }
}
