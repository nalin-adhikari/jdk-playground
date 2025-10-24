package np.com.nalin.patterns.creational.abstract_factory;

/**
 * WoodenToyFactory is a concrete factory that creates wooden toys.
 */
public class WoodenToyFactory implements ToyFactory {
    @Override
    public Car createCar() {
        return new WoodenCar();
    }

    @Override
    public Doll createDoll() {
        return new WoodenDoll();
    }
}