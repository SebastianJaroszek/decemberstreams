package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class Partitioning {

    public static Map<Boolean, List<Person>> partitionAdults7(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        List<Person> adults = new ArrayList<>();
        List<Person> kids = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person);
            } else {
                adults.add(person);
            }
        }
        map.put(true, adults);
        map.put(false, kids);
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(partitioningBy(person -> person.getAge() >= 18));
    }

}
