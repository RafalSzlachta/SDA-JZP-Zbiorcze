package pl.sda.ex26;

import java.util.List;

public class CarService {

    //porownac z kodem trenera!!
    public void printAllModels (List<Manufacturer> manufacturers) {
        manufacturers.stream().flatMap(m->m.models.stream()).forEach(System.out::println);
    }
}
