package np.com.nalin.patterns.creational.abstract_factory;

/**
 * ToyShop demonstrates the usage of the Abstract Factory pattern.
 */
public class ToyShop {
    private final ToyFactory factory;

    public ToyShop(ToyFactory factory) {
        this.factory = factory;
    }

    public void displayToys() {
        Car car = factory.createCar();
        Doll doll = factory.createDoll();

        System.out.println("Playing with our toys:");
        car.play();
        doll.play();
    }

    public static void main(String[] args) {
        // Create a wooden toy shop
        ToyShop woodenToyShop = new ToyShop(new WoodenToyFactory());
        System.out.println("=== Wooden Toy Shop ===");
        woodenToyShop.displayToys();

        // Create a plastic toy shop
        ToyShop plasticToyShop = new ToyShop(new PlasticToyFactory());
        System.out.println("\n=== Plastic Toy Shop ===");
        plasticToyShop.displayToys();
    }
}