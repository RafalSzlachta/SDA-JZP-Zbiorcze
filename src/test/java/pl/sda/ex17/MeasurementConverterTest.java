package pl.sda.ex17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeasurementConverterTest {
    @Test
    public void measurementConverterShouldConvertValuesCorrectly() {
        MeasurementConverter mc = new MeasurementConverter();

        double epsilon = 0.00001;
        assertEquals(254.0d,mc.convert(100, ConvertionType.INCHES_TO_CENTIMETERS), epsilon);
        assertEquals(100.0d,mc.convert(254, ConvertionType.CENTIMETERS_TO_ICHES), epsilon);

    }
}
