package org.example;

import java.util.ArrayList;
import java.util.List;


import static org.example.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("James", MALE),
                new Person("Ayomide", FEMALE),
                new Person("Bolaji", MALE),
                new Person("Tofunmi", FEMALE),
                new Person("Dayo", MALE)
        );

        imperativeApproachOne(people);
        declarativeApproachOne(people);
    }

    private static void declarativeApproachOne(List<Person> people) {
        System.out.println("DECLARATIVE APPROACH");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    private static void imperativeApproachOne(List<Person> people) {
        System.out.println("IMPERATIVE APPROACH");
        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(person.gender == FEMALE){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }
    }

    static class Person{
            private final String name;
            private final Gender gender;

            Person(String name, Gender gender) {
                this.name = name;
                this.gender = gender;
            }

            @Override
            public String toString() {
                final StringBuffer sb = new StringBuffer("Person{");
                sb.append("name='").append(name).append('\'');
                sb.append(", gender=").append(gender);
                sb.append('}');
                return sb.toString();
            }
        }

        enum Gender {
            MALE, FEMALE;
        }



}