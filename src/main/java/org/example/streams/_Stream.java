package org.example.streams;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.example.streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("James", MALE),
                new Person("Ayomide", FEMALE),
                new Person("Bolaji", MALE),
                new Person("Tofunmi", FEMALE),
                new Person("Dayo", MALE)
        );

//        people.stream()
//                .map(person -> person.gender)
//                    .collect(Collectors.toSet())
//                    .forEach(System.out::println);


//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

//       boolean output =  people.stream()
//                .allMatch(person -> Objects.equals(person.name, "James"));
//        System.out.println(output);
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
