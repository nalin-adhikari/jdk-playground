package np.com.nalin.patterns.creational.abstract_factory;

/**
 * WoodenDoll is a concrete implementation of the Doll interface.
 * It represents a toy doll made of wood.
 */
public class WoodenDoll implements Doll {
    @Override
    public void play() {
        System.out.println("Playing with wooden doll!");
    }
}