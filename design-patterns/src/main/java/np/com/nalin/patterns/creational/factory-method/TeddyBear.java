package np.com.nalin.patterns.creational.factory_method;

/**
 * TeddyBear is a concrete implementation of the Toy interface.
 * It represents a teddy bear toy that can be hugged.
 */
public class TeddyBear implements Toy {
    @Override
    public void play() {
        System.out.println("Hugging teddy bear!");
    }
}