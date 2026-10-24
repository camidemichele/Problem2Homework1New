/**
 * this class represents a surveillance drone and it stores the specs and implements the drone interface.
 */
public class SurveillanceDrone implements Drone {

    private String manufacturer; // who made the drone
    private int batteryCapacity; // battery in mAh
    private int flightRange; // how far it can fly in km
    private String specialFeature; // what makes this drone special
    /**
     * this constructor sets up the surveillance drone.
     */
    public SurveillanceDrone(String manufacturer, int batteryCapacity,
                             int flightRange, String specialFeature) {

        this.manufacturer = manufacturer; // saving the manufacturer
        this.batteryCapacity = batteryCapacity; // saving the battery
        this.flightRange = flightRange; // saving the range
        this.specialFeature = specialFeature; // saving its feature
    }
    /**
     * this method returns all the drone specifications.
     */
    @Override
    public String getSpecifications() {

        return "Surveillance Drone by " + manufacturer
                + ": Battery: " + batteryCapacity + " mAh"
                + ", Range: " + flightRange + " km"
                + ", Special Feature: " + specialFeature;
    }
}
