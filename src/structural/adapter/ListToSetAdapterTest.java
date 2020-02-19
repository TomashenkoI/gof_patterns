package structural.adapter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListToSetAdapterTest {

    @Test
    void test() {
        List<Integer> integersList = new ArrayList<>(Arrays.asList(1, 4, 6, 8));

        Set<Integer> integersSet = new ListToSetAdapter<>(integersList);

        assertEquals(integersList.size(), integersSet.size());
        assertTrue(integersSet.containsAll(integersList));
    }

}