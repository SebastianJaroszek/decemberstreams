package pl.dominisz.decemberstreams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Kids {

    public static Set<String> getKidNames7(List<Person> people) {
        Set<String> names = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                names.add(person.getName());
            }
        }
        return names;
    }

    public static Set<String> getKidNames(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }

}
