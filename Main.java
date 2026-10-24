/**
 *this is the where the drone system is tested and the drones are created from both manufacturers and print their specs we test the drone system.
 */
public class Main {

    public static void main(String[] args) {

        // creates manufacturer A's factory
        DroneFactory factoryA = new ManufacturerA();

        // creates a manager that uses manufacturer A
        DroneManager managerA = new DroneManager(factoryA);

        // creating the three types of drones from manufacturer A
        Drone surveillanceA = managerA.createDrone("surveillance");
        Drone deliveryA = managerA.createDrone("delivery");
        Drone agriculturalA = managerA.createDrone("agricultural");

        // printing the specs of manufacturer A's drones
        System.out.println(surveillanceA.getSpecifications());
        System.out.println(deliveryA.getSpecifications());
        System.out.println(agriculturalA.getSpecifications());
        System.out.println(); // leaving a space between manufacturers

        // creating manufacturer B's factory
        DroneFactory factoryB = new ManufacturerB();

        // creating a manager that uses manufacturer B
        DroneManager managerB = new DroneManager(factoryB);

        // creating the three types of drones from manufacturer B
        Drone surveillanceB = managerB.createDrone("surveillance");
        Drone deliveryB = managerB.createDrone("delivery");
        Drone agriculturalB = managerB.createDrone("agricultural");

        // printing the specs of manufacturer B's drones
        System.out.println(surveillanceB.getSpecifications());
        System.out.println(deliveryB.getSpecifications());
        System.out.println(agriculturalB.getSpecifications());
    }
}
