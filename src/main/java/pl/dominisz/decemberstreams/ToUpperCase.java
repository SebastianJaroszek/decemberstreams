package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static List<String> transform7(List<String> collection) {
        List<String> result = new ArrayList<>();
        for (String string : collection){
            result.add(string.toUpperCase());
        }
        return result;
    }

    public static List<String> transform(List<String> collection) {
        return collection.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
    }

}
