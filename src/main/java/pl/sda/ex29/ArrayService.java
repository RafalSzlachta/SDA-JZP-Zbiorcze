package pl.sda.ex29;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayService {
    //możemy nie mieć klasy generycznej a możemy mieć w niej metodę generyczną
    public <T> Double onArrayGetProportionOfFullfiledPredicate(Predicate<T> prd, T[] arr) {
        long itemsFullfilingCondition = Arrays.stream(arr).filter(prd).count();
        return new Double (itemsFullfilingCondition)/arr.length;
    }
}
