package pl.sda.ex12;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double price;
    private int productionYear;
    private List<Manufacturer> manufacturers;
    private EngineEnum engine;

    public Car(String name, String model, double price, int productionYear, List<Manufacturer> manufacturers, EngineEnum engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturers = manufacturers;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                productionYear == car.productionYear &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturers, car.manufacturers) &&
                engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionYear, manufacturers, engine);
    }
}
