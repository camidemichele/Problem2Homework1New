/**
 * this class creates drones made by manufacturer A and these drones focus more on longer flight ranges
 */
public class ManufacturerA implements DroneFactory {
    /**
     * this method creates a drone depending on the type requested.
     */
    @Override
    public Drone createDrone(String type) {
        // checks if the user wants a surveillance drone
        if (type.equalsIgnoreCase("surveillance")) {

            return new SurveillanceDrone(
                    "ManufacturerA",
                    4000, // battery capacity
                    50, // flight range
                    "High-quality camera"
            );
        }
        // checking if the user wants a delivery drone
        else if (type.equalsIgnoreCase("delivery")) {

            return new DeliveryDrone(
                    "ManufacturerA",
                    4200, // battery capacity
                    60, // flight range
                    "Long-distance package delivery"
            );
        }

        // checking if the user wants an agricultural drone
        else if (type.equalsIgnoreCase("agricultural")) {

            return new AgriculturalDrone(
                    "ManufacturerA",
                    4500, // battery capacity
                    55, // flight range
                    "Crop monitoring camera"
            );
        }

        // if the type doesn't exist, we show an error
        throw new IllegalArgumentException("Unknown drone type: " + type);
    }
}
