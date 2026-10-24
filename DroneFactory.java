/**
 * this interface is used by the manufacturers.
 * each manufacturer needs to know how to create drones.
 */
public interface DroneFactory {

    Drone createDrone(String type); // method to create a drone
}
