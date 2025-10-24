package np.com.nalin.patterns.creational.factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Toy Factory Tests")
class ToyFactoryTest {
    
    private ToyFactory factory;

    @BeforeEach
    void setUp() {
        factory = new ToyFactory();
    }

    @Test
    @DisplayName("Should create TeddyBear when type is 'teddy'")
    void createTeddyBear() {
        Toy toy = factory.createToy("teddy");
        assertNotNull(toy);
        assertTrue(toy instanceof TeddyBear);
    }

    @Test
    @DisplayName("Should create RobotToy when type is 'robot'")
    void createRobotToy() {
        Toy toy = factory.createToy("robot");
        assertNotNull(toy);
        assertTrue(toy instanceof RobotToy);
    }

    @ParameterizedTest
    @ValueSource(strings = {"teddy", "TEDDY", "Teddy"})
    @DisplayName("Should be case-insensitive when creating TeddyBear")
    void createTeddyBearCaseInsensitive(String input) {
        Toy toy = factory.createToy(input);
        assertNotNull(toy);
        assertTrue(toy instanceof TeddyBear);
    }

    @ParameterizedTest
    @ValueSource(strings = {"robot", "ROBOT", "Robot"})
    @DisplayName("Should be case-insensitive when creating RobotToy")
    void createRobotToyCaseInsensitive(String input) {
        Toy toy = factory.createToy(input);
        assertNotNull(toy);
        assertTrue(toy instanceof RobotToy);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException for unknown toy type")
    void throwExceptionForUnknownType() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> factory.createToy("car")
        );
        assertEquals("Unknown toy type: car", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException for null toy type")
    void throwExceptionForNullType() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> factory.createToy(null)
        );
        assertTrue(exception.getMessage().contains("null"));
    }
}