package org.example.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
//        Function<String, String> changetoUpperCase = String::toUpperCase;
          // name -> name.toUpperCase();
//        System.out.println(changetoUpperCase.apply("James"));


        Function<String, String> checkName = name -> {
            if(name.isBlank()) throw new IllegalArgumentException();
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> checkNameAge = (name, age) -> {
            if(name.isBlank()) throw new IllegalArgumentException();
            System.out.println(name);
            if(age <= 40) {
                System.out.println(name + "Is still very young, start from the top and say I can");
            }else{
                System.out.println(name.toUpperCase() + " You're getting older by the day");
            }
            return name.toUpperCase();
        };
        checkNameAge.apply("James", 50);
    }
}
