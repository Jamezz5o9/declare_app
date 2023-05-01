package org.example.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Customer {
    public static void main(String[] args) {
        Customer customer = new Customer("James", "08108963836");
        greetCustomer(customer);
        greetNewCustomer.accept(customer);
        greetCustomerBiConsumer.accept(customer, false);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + " This is your phoneNumber: " + customer.customerPhoneNumber);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showContact)
            -> System.out.println("Hello " + customer.customerName + " This is your phoneNumber: " + (showContact ? customer.customerPhoneNumber : "**********"));

    static Consumer<Customer> greetNewCustomer = customer
            -> System.out.println("Hello " + customer.customerName + " This is your phoneNumber: " + customer.customerPhoneNumber);

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
