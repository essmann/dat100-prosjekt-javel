package no.hvl.dat100.javel.oppgave3;
import java.util.Random;
public class Customer {

    // TODO - object variables (attributes)

    String email;
    String name;
    PowerAgreementType agreement;
    int customer_id;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
        // TODO

    }

    // TODO - getter/setter methods for all objectvariables
    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public PowerAgreementType getAgreement() {
        return this.agreement;
    }

    public int getCustomerId() {
        return this.customer_id;
    }

    // TODO - toString method
    @Override
    public String toString() {
        String str = " Customer number %d \n Name %s \n Email %s \n Agreement %s ";
        return String.format(str, customer_id, name, email, agreement);
    }
    public static Customer createRandom() {
        String[] names = {"Alice Smith", "Bob Johnson", "Carol Lee", "David Brown"};
        String[] emails = {"alice@example.com", "bob@example.com", "carol@example.com", "david@example.com"};

        Random rand = new Random();
        String name = names[rand.nextInt(names.length)];
        String email = emails[rand.nextInt(emails.length)];
        int customerId = 1000 + rand.nextInt(9000); // random ID between 1000-9999
        PowerAgreementType agreement = PowerAgreementType.values()[rand.nextInt(PowerAgreementType.values().length)];

        return new Customer(name, email, customerId, agreement);
    }

}
