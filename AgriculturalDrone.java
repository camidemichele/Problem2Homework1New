/**
 * this class represents an agricultural drone
 * it can be used for farming and crop monitoring
 */
public class AgriculturalDrone implements Drone {

    private String manufacturer; // company that made the drone
    private int batteryCapacity; // battery in mAh
    private int flightRange; // flight distance
    private String specialFeature; // farming feature

    /**
     * this constructor sets up the agricultural drone
     */
    public AgriculturalDrone(String manufacturer, int batteryCapacity,
                             int flightRange, String specialFeature) {

        this.manufacturer = manufacturer; // storing the manufacturer
        this.batteryCapacity = batteryCapacity; // storing the battery
        this.flightRange = flightRange; // stores the range
        this.specialFeature = specialFeature; // storing the features
    }
    /**
     * this method returns the agricultural drone specifications
     */
    @Override
    public String getSpecifications() {

        return "Agricultural Drone by " + manufacturer
                + ": Battery: " + batteryCapacity + " mAh"
                + ", Range: " + flightRange + " km"
                + ", Special Feature: " + specialFeature;
    }
}

