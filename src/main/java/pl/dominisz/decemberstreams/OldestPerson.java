package pl.dominisz.decemberstreams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    public static Person getOldestPerson7(List<Person> people) {
        Person oldest = people.get(0);
        for (int i = 1; i < people.size(); i++) {
            Person oldest2 = people.get(i);
            if (oldest.getAge() < oldest2.getAge()) {
                oldest = oldest2;
            }
        }
        return oldest;
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream()
                .max(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                }).orElse(null);
    }

}
