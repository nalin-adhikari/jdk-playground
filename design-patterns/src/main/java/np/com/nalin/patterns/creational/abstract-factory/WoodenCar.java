package np.com.nalin.patterns.creational.abstract_factory;

/**
 * WoodenCar is a concrete implementation of the Car interface.
 * It represents a toy car made of wood.
 */
public class WoodenCar implements Car {
    @Override
    public void play() {
        System.out.println("Rolling the wooden car!");
    }
}