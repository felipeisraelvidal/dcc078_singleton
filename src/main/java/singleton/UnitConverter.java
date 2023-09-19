package singleton;

public class UnitConverter {

    private static UnitConverter instace = new UnitConverter();

    private UnitConverter() {}

    public static UnitConverter getInstance() {
        return instace;
    }

    public double metersToCentimeters(double meters) {
        return meters * 100f;
    }

    public double centimetersToMeters(double centimeters) {
        return centimeters / 100f;
    }

}
