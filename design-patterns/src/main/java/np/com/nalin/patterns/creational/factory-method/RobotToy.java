package np.com.nalin.patterns.creational.factory_method;

/**
 * RobotToy is a concrete implementation of the Toy interface.
 * It represents a robot toy that can walk and talk.
 */
public class RobotToy implements Toy {
    @Override
    public void play() {
        System.out.println("Robot is walking and talking!");
    }
}