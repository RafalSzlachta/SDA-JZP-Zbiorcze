package pl.sda.ex14;

import java.util.*;
import java.util.stream.Collectors;

//uzupełnić!!
public class ArrayService {

    public Integer[] returnRandomArray(int n, int bound){
        Integer[] arr = new Integer[n];
        Random r = new Random();
        for (int i=0 , i<arr.length,  arr) {
            i = r.nextInt(bound);
        }
    }

    public List<Integer> returnUniqueValues(Integer[] arr){
        Set<Integer> uniqueValues = new HashSet<>();
        for (Integer i : arr){
            uniqueValues.add(i);
        }
        List<Integer> output = new ArrayList<>(uniqueValues);
        return output;
    }

   // public List<Integer> returnDuplicates()


    public List<Integer> return25MostFrequentElements(Integer[] arr){
        //List<>
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (Integer i : arr) {
            if (freq.containsKey(i))
            {
                freq.put(i, freq.get(i)+1);
            } else {
                freq.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> listOfFrequencies = new ArrayList(freq.entrySet());
        Collections.sort(listOfFrequencies, Comparator.comparing((Map.Entry<Integer, Integer> e) -> e.getValue()).reversed());

        return listOfFrequencies.stream().limit(25).map((e) -> e.getKey()).collect(Collectors.toList());
    }

    public void deduplicate(Integer[] arr, int bound){
        Set<Integer> encountered = new HashSet<>();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            while (encountered.contains(arr[i])){
                arr[i]=r.nextInt(bound);
            }
            encountered.add(arr[i]);
            
        }

    }
}
