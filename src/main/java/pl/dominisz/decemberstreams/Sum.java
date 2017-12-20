package pl.dominisz.decemberstreams;

import java.util.List;

public class Sum {

    public static int calculate7(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers){
            sum = sum + number;
        }
        return sum;
    }

    public static int calculate(List<Integer> people) {
        return people.stream()
                .reduce(0, Integer::sum);
        //.reduce(0, (int1, int2) -> int1 + int2);
    }

}
