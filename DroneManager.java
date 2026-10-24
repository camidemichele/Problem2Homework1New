/**
 * this class manages the creation of drones and it uses a factory instead of creating drones directly
 */
public class DroneManager {

    private DroneFactory factory; // storing the selected factory
    /**
     * this constructor receives the manufacturer factory
     */
    public DroneManager(DroneFactory factory) {

        this.factory = factory; // saving the factory we want to use
    }
    /**
     * this method asks the factory to create a drone
     */
    public Drone createDrone(String type) {

        return factory.createDrone(type); // letting the factory do the work
    }
}
