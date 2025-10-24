package np.com.nalin.patterns.creational.abstract_factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Abstract Factory pattern implementation.
 */
class ToyFactoryTest {
    private ToyFactory woodenFactory;
    private ToyFactory plasticFactory;

    @BeforeEach
    void setUp() {
        woodenFactory = new WoodenToyFactory();
        plasticFactory = new PlasticToyFactory();
    }

    @Test
    @DisplayName("Wooden factory should create wooden toys")
    void woodenFactoryCreatesWoodenToys() {
        Car car = woodenFactory.createCar();
        Doll doll = woodenFactory.createDoll();

        assertTrue(car instanceof WoodenCar, "Car should be a wooden car");
        assertTrue(doll instanceof WoodenDoll, "Doll should be a wooden doll");
    }

    @Test
    @DisplayName("Plastic factory should create plastic toys")
    void plasticFactoryCreatesPlasticToys() {
        Car car = plasticFactory.createCar();
        Doll doll = plasticFactory.createDoll();

        assertTrue(car instanceof PlasticCar, "Car should be a plastic car");
        assertTrue(doll instanceof PlasticDoll, "Doll should be a plastic doll");
    }

    @Test
    @DisplayName("Wooden toys should have correct play behavior")
    void woodenToysHaveCorrectBehavior() {
        Car car = woodenFactory.createCar();
        Doll doll = woodenFactory.createDoll();

        assertDoesNotThrow(() -> {
            car.play();
            doll.play();
        }, "Playing with wooden toys should not throw exceptions");
    }

    @Test
    @DisplayName("Plastic toys should have correct play behavior")
    void plasticToysHaveCorrectBehavior() {
        Car car = plasticFactory.createCar();
        Doll doll = plasticFactory.createDoll();

        assertDoesNotThrow(() -> {
            car.play();
            doll.play();
        }, "Playing with plastic toys should not throw exceptions");
    }
}