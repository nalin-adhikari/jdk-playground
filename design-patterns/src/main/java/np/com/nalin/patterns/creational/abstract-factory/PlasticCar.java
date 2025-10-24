package np.com.nalin.patterns.creational.abstract_factory;

/**
 * PlasticCar is a concrete implementation of the Car interface.
 * It represents a toy car made of plastic.
 */
public class PlasticCar implements Car {
    @Override
    public void play() {
        System.out.println("Zooming with plastic car!");
    }
}