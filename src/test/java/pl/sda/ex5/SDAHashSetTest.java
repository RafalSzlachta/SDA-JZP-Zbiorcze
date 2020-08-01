package pl.sda.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SDAHashSetTest {
    @Test
    public void showcase(){
        //arrange
        SDAHashSet<Integer> set = new SDAHashSet<>();

        //act
        set.add(1);
        System.out.println(set.contains(1));
        set.add(2);
        set.remove(1);
        set.clear();

        //assert
        assertTrue(set.isEmpty());
        assertEquals(5, set.getOperationCounter());
    }
}
