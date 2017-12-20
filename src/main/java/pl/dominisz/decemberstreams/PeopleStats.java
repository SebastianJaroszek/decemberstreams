package pl.dominisz.decemberstreams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleStats {

    public static Stats getStats7(List<Person> people) {
        long sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Person person : people) {
            int age = person.getAge();
            sum = sum + age;
            min = Math.min(min, age);
            max = Math.max(max, age);
        }
        return new Stats(people.size(), sum, min, max);
    }

    public static IntSummaryStatistics getStats(List<Person> people) {
        return people.stream()
                .collect(Collectors.summarizingInt(person -> person.getAge()));
        /*return people.stream()
                .mapToInt(person -> person.getAge())
                .summaryStatistics();*/
    }

}
