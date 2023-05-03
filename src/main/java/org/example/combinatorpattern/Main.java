package org.example.combinatorpattern;

import java.time.LocalDate;

import static org.example.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "James",
                "adulojujames@gmail.com",
                "+234747474743838",
                LocalDate.of(2000, 1, 1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println(validatorService.credentialValidation(customer));


        ValidationResult result = isEmailValid()
                .validateCustomerCredentials(isPhoneValid())
                .validateCustomerCredentials(isAdult())
                .apply(customer);

        System.out.println(result);
    }
}
