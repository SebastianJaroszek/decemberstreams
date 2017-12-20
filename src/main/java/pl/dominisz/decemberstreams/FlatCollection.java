package pl.dominisz.decemberstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatCollection {

    public static List<String> transform7(List<List<String>> collection) {
        List<String> list = new ArrayList<>();

        for (List<String> stringList : collection){
            for (String string : stringList){
                list.add(string);
            }
        }
        return list;
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
                .flatMap(collect -> collect.stream())
                .collect(Collectors.toList());
    }

}
