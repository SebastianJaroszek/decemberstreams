package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.dominisz.decemberstreams.Kids.getKidNames;
import static pl.dominisz.decemberstreams.Kids.getKidNames7;

/*
Get names of all kids (under age of 18) ; map filter
 */
public class KidsTest {

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsFromNorway() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        Set<String> result = getKidNames(collection);
        assertTrue(result.contains("Sara"));
        assertTrue(result.contains("Anna"));
        assertFalse(result.contains("Viktor"));
        assertFalse(result.contains("Eva"));
    }

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsFromNorway7() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        Set<String> result = getKidNames7(collection);
        assertTrue(result.contains("Sara"));
        assertTrue(result.contains("Anna"));
        assertFalse(result.contains("Viktor"));
        assertFalse(result.contains("Eva"));
    }

}
