package org.example.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("90876645342"));
        System.out.println(isPhoneNumberValid("40876645342"));
        System.out.println(isPhoneNumberValid("90876645345"));
        System.out.println(isPhoneNumberValid("908766453421"));
        System.out.println(isPhoneValid.test("888888"));
        isPhoneValid.test()

    }

    static Predicate<String> isPhoneValid = phoneNumber -> phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("90") && phoneNumber.endsWith("2") && phoneNumber.length() == 11;
    }
}
