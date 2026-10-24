/**
 * this class represents a delivery drone and it stores the information about the drone
 */
public class DeliveryDrone implements Drone {

    private String manufacturer; // company that made it
    private int batteryCapacity; // battery capacity
    private int flightRange; // how far it flies
    private String specialFeature; // its special ability
    /**
     * this constructor creates a delivery drone with its specs
     */
    public DeliveryDrone(String manufacturer, int batteryCapacity,
                         int flightRange, String specialFeature) {

        this.manufacturer = manufacturer; // saving the company
        this.batteryCapacity = batteryCapacity; // saving battery
        this.flightRange = flightRange; // saving range
        this.specialFeature = specialFeature; // saving feature
    }
    /**
     * this method returns the delivery drone information
     */
    @Override
    public String getSpecifications() {

        return "Delivery Drone by " + manufacturer
                + ": Battery: " + batteryCapacity + " mAh"
                + ", Range: " + flightRange + " km"
                + ", Special Feature: " + specialFeature;
    }
}
