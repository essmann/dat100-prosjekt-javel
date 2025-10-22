package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {
        int NUM_FAKE_CUSTOMERS = 8;
        boolean PRINT_FAKE_CUSTOMERS = true;
        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println("a) Testing customers constructor.");
        Customers customers = new Customers(20);
        System.out.println("Customers object initialized.");
        System.out.println("==============");

        System.out.println("Generating fake customers for testing.");
        for (int i = 0; i < NUM_FAKE_CUSTOMERS; i++) {
            Customer c = Customer.createRandom();

            customers.addCustomer(c);
            if (PRINT_FAKE_CUSTOMERS) {
                System.out.println("------------------------");
                System.out.println(c);
            }
        }


        System.out.println("==============");
        System.out.println("b) testing countNonNull(). result: " + customers.countNonNull());
        System.out.println("==============");
        System.out.println("c) testing getCustomer.");
        int id = 123456;
        Customer new_customer = new Customer("Ken William", "myself@gmail.com", id, PowerAgreementType.SPOTPRICE);
        customers.addCustomer(new_customer);
        System.out.println("Getting a customer by id: " + id);
        System.out.println("result: " + customers.getCustomer(id));
        System.out.println("==============");
        System.out.println("d) Testing addCustomer");
        Customer t = new Customer("testCustomer", "test@test.com", 1000000, PowerAgreementType.NORGESPRICE);
        System.out.println("Result of calling addCustomer(t): " + customers.addCustomer(t));
        System.out.println("==============");
        System.out.println("e) Result of removing the recently added customer: \n" + customers.removeCustomer(t.getCustomerId()));
        System.out.println("==============");
        System.out.println("f) Testing getCustomers() ");
        Customer[] new_customers = customers.getCustomers();
        System.out.println("Length of getCustomers(): " + new_customers.length);
        System.out.println("Raw data: " + new_customers);



        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
