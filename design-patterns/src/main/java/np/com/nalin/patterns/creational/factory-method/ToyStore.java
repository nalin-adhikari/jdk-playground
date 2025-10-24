package np.com.nalin.patterns.creational.factory_method;

/**
 * ToyStore demonstrates how to use the Factory Method pattern.
 * This class shows how to create and use different types of toys using the factory.
 */
public class ToyStore {
    public static void main(String[] args) {
        // Create the toy factory
        ToyFactory factory = new ToyFactory();
        
        // Create and play with a teddy bear
        System.out.println("Creating a teddy bear...");
        Toy teddyBear = factory.createToy("teddy");
        teddyBear.play();
        
        // Create and play with a robot
        System.out.println("\nCreating a robot...");
        Toy robot = factory.createToy("robot");
        robot.play();
        
        // Try to create an invalid toy (will throw an exception)
        try {
            System.out.println("\nTrying to create an invalid toy...");
            factory.createToy("car");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}