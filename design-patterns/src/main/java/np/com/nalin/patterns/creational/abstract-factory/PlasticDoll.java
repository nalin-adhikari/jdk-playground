package np.com.nalin.patterns.creational.abstract_factory;

/**
 * PlasticDoll is a concrete implementation of the Doll interface.
 * It represents a toy doll made of plastic.
 */
public class PlasticDoll implements Doll {
    @Override
    public void play() {
        System.out.println("Playing with plastic doll!");
    }
}