package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        Customer customer = new Customer("Ken", "something@gmail.com", 123, PowerAgreementType.SPOTPRICE);
        System.out.println("Testing methods... e)");
        System.out.println("d) toString method: ");
        System.out.println(customer.toString());
        System.out.println("Testing get/set methods c)");
        System.out.println("getName(): " + customer.getName() + " getEmail(): " + customer.getEmail());
        System.out.println("getCustomerId(): " + customer.getCustomerId() + " getAgreement(): " + customer.getAgreement());

        
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
