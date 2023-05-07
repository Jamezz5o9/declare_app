package org.example.javastreams;

import org.example.beans.Person;
import org.example.mockdata.MockData;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {

    @Test
    public void imperativeProgramming() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> belowNineteen = new ArrayList<>();
        int counter = 0;
        int limit = 10;
        for (Person person : people) {
            if (person.getAge() <= 18) belowNineteen.add(person); counter++;
            if (counter == limit) break;
        }
        belowNineteen.forEach(System.out::println);
    }

    @Test
    public void declarativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> belowNineteen = new ArrayList<>();
        List<Person> collect = people.stream()
                .filter(person -> person.getAge() >= 18)
                .limit(10)
                .toList();
//        System.out.println(collect);
    }

}
