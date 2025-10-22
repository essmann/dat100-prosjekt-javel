package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        // TODO
        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;
        for (Customer customer : this.customers) {
            if (customer != null) {
                count++;
            }
        }

        // TODO

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer customer : this.customers) {
            if (customer.getCustomerId() == customer_id) {
                funnet = true;
                c = customer;
                break;
            }
        }
        // TODO

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] != null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }
        // TODO

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;
        for (int i = 0; i < this.customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomerId() == customer_id) {
                c = customers[i];
                customers[i] = null;
            }
        }
        // TODO

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;
        int newLength = countNonNull();
        int index = 0;
        customers = new Customer[newLength];

        for(Customer customer : this.customers){
            if(customer != null){
                customers[index] = customer;
                index++;
            }
        }
        // TODO

        return customers;
    }
}