package pl.sda.ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelValidatorTest {
    @Test
    public void validationShouldNotPassIfOneDimentionsIsLessThanLimit()
    {
        Parcel p1 = new Parcel(31, 31,31, 2.0f, true); //true
        Parcel p2 = new Parcel(29, 31,31, 2.0f, true); //false
        Parcel p3 = new Parcel(31, 29,31, 2.0f, true); //false
        Parcel p4 = new Parcel(31, 31,29, 2.0f, true); //false

        ParcelValidator pv = new ParcelValidator();

        assertEquals(true, pv.validate(p1), "all dimensions are ok");
        assertEquals(false, pv.validate(p2), "x lenght exceeds the limit");
        assertEquals(false, pv.validate(p3), "y lenght exceeds the limit");
        assertEquals(false, pv.validate(p4), "z lenght exceeds the limit");
    }

    @Test
    public void validationShouldNotPassWhenParcelViolatesMultipleConditions()
    {
        Parcel p4 = new Parcel(31, 31,29, 25.0f, true); //false

        ParcelValidator pv = new ParcelValidator();


        assertEquals(false, pv.validate(p4));
    }
}
