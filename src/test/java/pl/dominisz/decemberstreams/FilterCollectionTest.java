package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.FilterCollection.*;

/*
Filter collection so that only elements with less then 4 characters are returned.
 */
public class FilterCollectionTest {

    @Test
    public void transformShouldFilterCollection() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertEquals(transform(collection), expected);
    }

    @Test
    public void transformShouldFilterCollection7() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertEquals(transform7(collection), expected);
    }

}
