package np.com.nalin.patterns.creational.abstract_factory;

/**
 * PlasticToyFactory is a concrete factory that creates plastic toys.
 */
public class PlasticToyFactory implements ToyFactory {
    @Override
    public Car createCar() {
        return new PlasticCar();
    }

    @Override
    public Doll createDoll() {
        return new PlasticDoll();
    }
}