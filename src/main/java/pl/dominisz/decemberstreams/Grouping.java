package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Grouping {

    public static Map<String, List<Person>> groupByNationality7(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();

        for (Person person : people){
            String nationality = person.getNationality();
            List<Person> list = map.get(nationality);
            if (list != null){
                list.add(person);
            } else {
                list = new ArrayList<>();
                list.add(person);
                map.put(nationality, list);
            }
        }

        return map;
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream()
                .collect(groupingBy(Person::getNationality));
    }

}
