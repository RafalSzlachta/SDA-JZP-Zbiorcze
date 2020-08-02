package pl.sda.ex17;

public enum ConvertionType {
    CENTIMETERS_TO_ICHES(1d/2.54d),
    INCHES_TO_CENTIMETERS(2.54d);

    private double converter;

    ConvertionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }
}
