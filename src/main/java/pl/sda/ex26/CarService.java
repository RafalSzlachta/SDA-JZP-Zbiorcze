package pl.sda.ex26;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CarService {


    private static final Logger LOGGER = Logger.getLogger( CarService.class.getName() );

    public void printAllModels (List<Manufacturer> manufacturers) {
        List<Model> models =
                manufacturers.stream()
                        .flatMap(p->p.models.stream())
                        .collect(Collectors.toList());

        LOGGER.log(Level.INFO, "Printing models: " + models);
        System.out.print(models);
    }

    public void printAllCars (List<Manufacturer> manufacturers) {
        List<Car> cars =
                manufacturers.stream()
                        .flatMap(p->p.models.stream())
                        .flatMap(m->m.cars.stream())
                        .collect(Collectors.toList());

        LOGGER.log(Level.INFO, "Printing cars: " + cars);
        LOGGER.log(Level.INFO, "Printed cars size: " + cars.size());
        System.out.print(cars);
    }

    public void printAllManufacturerNames (List<Manufacturer> manufacturers) {
                manufacturers.stream()
                        .map(p->p.name)
                        .forEach(System.out::println);

    }

    public void printAllManufacturerCreationYear (List<Manufacturer> manufacturers) {
        manufacturers.stream()
                .map(p->p.yearOfCreation)
                .forEach(s-> System.out.println(s));
    }

    public void printAllModelNames (List<Manufacturer> manufacturers) {
        manufacturers.stream()
                .flatMap(m->m.models.stream())
                .map(m->m.name)
                .forEach(s-> System.out.println(s));
    }

    private static boolean isEvenYear(int year) { return year%2==0; }

    public void printAllModelProducedInEvenYear (List<Manufacturer> manufacturers) {
        manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .filter(m -> m.productionStartYear % 2 == 0)
                .forEach(s -> System.out.println(s));
    }

    public void printAllModelProducedInEvenYearReferenceVersion (List<Manufacturer> manufacturers) {
        manufacturers.stream()
                .flatMap(m -> m.models.stream())
                .map(m->m.productionStartYear)
                .filter(CarService::isEvenYear)
                .forEach(s -> System.out.println(s));
    }


    public void printAllCarsPoducedInEvenYersByProducersFoundedInOddYear (List<Manufacturer> manufacturers) {
        manufacturers.stream()
                .filter(m->m.yearOfCreation%2==1)
                .flatMap(m -> m.models.stream())
                .filter(m->m.productionStartYear%2==0)
                .flatMap(m->m.cars.stream())
                .forEach(s -> System.out.println(s));
    }

    public void printAllCabrioCarsPoducedInEvenYersByProducersFoundedInOddYear (List<Manufacturer> manufacturers) {
        manufacturers.stream()
                .filter(m->m.yearOfCreation%2==1)
                .flatMap(m -> m.models.stream())
                .filter(m->m.productionStartYear%2==0)
                .flatMap(m->m.cars.stream())
                .filter(c->c.carType.equals(CarTypeEnum.CABRIO))
                .forEach(s -> System.out.println(s));
    }
}
