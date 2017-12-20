package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.ToUpperCase.transform;
import static pl.dominisz.decemberstreams.ToUpperCase.transform7;

/*
Convert elements of a collection to upper case. ; map
 */
public class ToUpperCaseTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertEquals(transform(collection), expected);
    }

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase7() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertEquals(transform7(collection), expected);
    }

}
