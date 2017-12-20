package pl.dominisz.decemberstreams;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Joining {

    public static String namesToString7(List<Person> people) {
        String result = "Names: ";

        for (int i = 0; i < people.size(); i++) {
            result += people.get(i).getName();
            if (i < people.size() - 1) {
                result += ", ";
            }
        }

        return result + ".";
    }

    public static String namesToString(List<Person> people) {
        return people.stream()
                .map(person -> person.getName())
                .collect(joining(", ", "Names: ", "."));
    }

}
