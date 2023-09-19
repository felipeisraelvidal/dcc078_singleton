package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterTest {

    @Test
    public void testMetersToCentimeters() {
        double meters = 2f;
        double result = UnitConverter.getInstance().metersToCentimeters(meters);
        assertEquals(result, 200);
    }

    @Test
    public void testCentimetersToMeters() {
        double centimeters = 300f;
        double result = UnitConverter.getInstance().centimetersToMeters(centimeters);
        assertEquals(result, 3);
    }

}
