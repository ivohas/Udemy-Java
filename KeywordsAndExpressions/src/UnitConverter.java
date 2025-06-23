public class UnitConverter {
    final double kmToMiles = 0.621371;
    final double milesToKm = 1.609344;
    final double kgToPounds = 2.20462;

    public double getKgToPounds(double kg) {
        return (kg * kgToPounds);
    }

    public double getMilesToKm(double miles) {
        return (miles * milesToKm);
    }

    public double getKmToMiles(double km) {
        return (km * kmToMiles);
    }
}
