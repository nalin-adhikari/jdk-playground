package np.com.nalin.patterns.creational.factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@DisplayName("Toy Store Integration Tests")
class ToyStoreIntegrationTest {
    
    private ToyFactory factory;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        factory = new ToyFactory();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    @DisplayName("Should demonstrate complete toy creation and play workflow")
    void demonstrateCompleteWorkflow() {
        // Create and play with teddy bear
        Toy teddyBear = factory.createToy("teddy");
        assertTrue(teddyBear instanceof TeddyBear);
        teddyBear.play();
        assertTrue(outputStream.toString().contains("Hugging teddy bear!"));

        // Reset output stream
        outputStream.reset();

        // Create and play with robot
        Toy robot = factory.createToy("robot");
        assertTrue(robot instanceof RobotToy);
        robot.play();
        assertTrue(outputStream.toString().contains("Robot is walking and talking!"));

        // Cleanup
        System.setOut(System.out);
    }

    @Test
    @DisplayName("Should handle error scenarios in workflow")
    void handleErrorScenarios() {
        // Try to create invalid toy
        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> factory.createToy("invalid")
        );
        assertEquals("Unknown toy type: invalid", exception.getMessage());

        // Verify that valid operations still work after error
        Toy teddy = factory.createToy("teddy");
        assertNotNull(teddy);
        assertTrue(teddy instanceof TeddyBear);

        // Cleanup
        System.setOut(System.out);
    }
}