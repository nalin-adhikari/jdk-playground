package np.com.nalin.patterns.creational.abstract_factory;

/**
 * ToyFactory is the abstract factory interface that defines methods
 * for creating different types of toys.
 */
public interface ToyFactory {
    /**
     * Creates a toy car.
     * @return a Car instance
     */
    Car createCar();

    /**
     * Creates a toy doll.
     * @return a Doll instance
     */
    Doll createDoll();
}