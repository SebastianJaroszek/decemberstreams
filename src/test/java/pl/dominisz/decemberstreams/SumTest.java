package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pl.dominisz.decemberstreams.Sum.calculate;
import static pl.dominisz.decemberstreams.Sum.calculate7;

/*
Sum all elements of a collection ; sum
 */
public class SumTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase7() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertTrue(calculate7(numbers) ==  1 + 2 + 3 + 4 + 5);
    }

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertTrue(calculate(numbers) ==  1 + 2 + 3 + 4 + 5);
    }

}
