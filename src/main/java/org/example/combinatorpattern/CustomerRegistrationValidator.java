package org.example.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static org.example.combinatorpattern.CustomerRegistrationValidator.*;
import static org.example.combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneValid(){
        return customer -> customer.getPhoneNumber().startsWith("+234") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }
    static CustomerRegistrationValidator isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator validateCustomerCredentials(CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }
    enum ValidationResult{
            SUCCESS,
            PHONE_NUMBER_NOT_VALID,
            EMAIL_NOT_VALID,
            IS_NOT_AN_ADULT
    }

}
