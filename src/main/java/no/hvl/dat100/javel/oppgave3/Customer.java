package no.hvl.dat100.javel.oppgave3;

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

}
