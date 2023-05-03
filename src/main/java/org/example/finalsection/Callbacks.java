package org.example.finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("James", null, callback -> {
            System.out.println("no lastName provided " +  callback);
        });

        helloTwo("James", null, () -> System.out.println("No Last Name"));
    }

//    function hello(fistName, lastName, callback){
//        console.log(firstName);
//        if(lastName){
//            console.log(lastName);
//        } else{
//            callback();
//        }
//    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else{
            callback.accept(firstName);
        }
    }

    static void helloTwo(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        } else{
            callback.run();
        }
    }
}
