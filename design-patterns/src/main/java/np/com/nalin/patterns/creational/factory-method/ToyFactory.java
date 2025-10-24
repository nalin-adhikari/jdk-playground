package np.com.nalin.patterns.creational.factory_method;

/**
 * ToyFactory is responsible for creating different types of toys.
 * This is the factory class in the Factory Method pattern.
 */
public class ToyFactory {
    /**
     * Creates a toy based on the specified toy type.
     *
     * @param toyType the type of toy to create ("teddy" or "robot")
     * @return the created toy
     * @throws IllegalArgumentException if the toy type is unknown
     */
    public Toy createToy(String toyType) {
        if (toyType == null) {
            throw new IllegalArgumentException("Toy type cannot be null");
        }
        return switch (toyType.toLowerCase()) {
            case "teddy" -> new TeddyBear();
            case "robot" -> new RobotToy();
            default -> throw new IllegalArgumentException("Unknown toy type: " + toyType);
        };
    }
}