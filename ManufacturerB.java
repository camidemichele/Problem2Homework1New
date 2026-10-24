/**
 * creates drones made by manufacturer and these drones focus more on battery capacity
 */
public class ManufacturerB implements DroneFactory {
    /**
     * creates drones depending on the type requested.
     */
    @Override
    public Drone createDrone(String type) {
        // checking if the user wants a surveillance drone
        if (type.equalsIgnoreCase("surveillance")) {

            return new SurveillanceDrone(
                    "ManufacturerB",
                    5500, // battery capacity
                    35, // flight range
                    "Night vision camera"
            );
        }
        // checking if the user wants a delivery drone
        else if (type.equalsIgnoreCase("delivery")) {

            return new DeliveryDrone(
                    "ManufacturerB",
                    5000, // battery capacity
                    40, // flight range
                    "High payload capacity"
            );
        }
        // checking if the user wants an agricultural drone
        else if (type.equalsIgnoreCase("agricultural")) {

            return new AgriculturalDrone(
                    "ManufacturerB",
                    6000, // battery capacity
                    38, // flight range
                    "Precision crop spraying"
            );
        }
        // if the drone type doesn't exist, it shows an error
        throw new IllegalArgumentException("Unknown drone type: " + type);
    }
}
