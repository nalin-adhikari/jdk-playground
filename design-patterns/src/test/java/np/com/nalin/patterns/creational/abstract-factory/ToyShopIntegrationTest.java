package np.com.nalin.patterns.creational.abstract_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests for the ToyShop implementation.
 */
class ToyShopIntegrationTest {
    @Test
    @DisplayName("ToyShop should work with wooden toys")
    void toyShopWithWoodenToys() {
        ToyShop shop = new ToyShop(new WoodenToyFactory());
        assertDoesNotThrow(() -> shop.displayToys(),
            "ToyShop should display wooden toys without errors");
    }

    @Test
    @DisplayName("ToyShop should work with plastic toys")
    void toyShopWithPlasticToys() {
        ToyShop shop = new ToyShop(new PlasticToyFactory());
        assertDoesNotThrow(() -> shop.displayToys(),
            "ToyShop should display plastic toys without errors");
    }

    @Test
    @DisplayName("ToyShop should handle switching factories")
    void toyShopCanSwitchFactories() {
        // Start with wooden toys
        final ToyShop woodenShop = new ToyShop(new WoodenToyFactory());
        assertDoesNotThrow(() -> woodenShop.displayToys(),
            "ToyShop should display wooden toys without errors");

        // Switch to plastic toys
        final ToyShop plasticShop = new ToyShop(new PlasticToyFactory());
        assertDoesNotThrow(() -> plasticShop.displayToys(),
            "ToyShop should display plastic toys without errors");
    }
}