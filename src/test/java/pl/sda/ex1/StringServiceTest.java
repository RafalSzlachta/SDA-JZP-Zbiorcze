package pl.sda.ex1;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServiceTest {
    @Test
    public void testGetSortedAlphabeticllyZAShouldSortCorrectly(){
        List<String> listUnsorted = new ArrayList<>();
        getUnsortedStrings(listUnsorted);

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();
        listSorted = ss.getSortedAlphabeticallyZA(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted = Arrays.asList("za","ab","aa","aB","Ab");

        assertEquals(manuallyListSorted, listSorted);
    }

    @Test
    public void testGetSortedAlphabeticllyZACaseInsensitiveShouldSortCorrectly(){
        List<String> listUnsorted = new ArrayList<>();
        getUnsortedStrings(listUnsorted);

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();
        listSorted = ss.getSortedAlphabeticallyZACaseIntensitive(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted = Arrays.asList("za","ab","Ab","aB","aa");

        assertEquals(manuallyListSorted, listSorted);
    }

    //coś nie działa, porównaj z kodem trenera
    private List<String> getUnsortedStrings(List<String> listUnsorted) {
        listUnsorted.add("za");
        listUnsorted.add("Ab");
        listUnsorted.add("aa");
        listUnsorted.add("aB");
        listUnsorted.add("ab");
        return listUnsorted;
    }


}
