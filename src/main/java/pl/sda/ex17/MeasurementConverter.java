package pl.sda.ex17;

public class MeasurementConverter {
    public double convert(int value, ConvertionType convertionType){
        return value*convertionType.getConverter();
    }

}
