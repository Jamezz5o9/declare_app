package org.example.functionalInterface;

import com.sun.jdi.IntegerType;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment1 = increment(1);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addOneThenMultiplyByTen = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addOneThenMultiplyByTen.apply(4));


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static BiFunction<Integer, Integer, Integer> incrementByOneBiFunction = (number, secondNumber) -> number * secondNumber;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
    static int increment(int number){
        return number + 1;
    }
}
