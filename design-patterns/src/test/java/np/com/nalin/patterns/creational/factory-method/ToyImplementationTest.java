package np.com.nalin.patterns.creational.factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@DisplayName("Toy Implementation Tests")
class ToyImplementationTest {

    @Nested
    @DisplayName("TeddyBear Tests")
    class TeddyBearTest {
        @Test
        @DisplayName("Should print correct message when playing with teddy bear")
        void teddyBearPlayMessage() {
            // Arrange
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            Toy teddyBear = new TeddyBear();

            // Act
            teddyBear.play();

            // Assert
            assertEquals("Hugging teddy bear!" + System.lineSeparator(), outputStream.toString());

            // Cleanup
            System.setOut(System.out);
        }
    }

    @Nested
    @DisplayName("RobotToy Tests")
    class RobotToyTest {
        @Test
        @DisplayName("Should print correct message when playing with robot toy")
        void robotToyPlayMessage() {
            // Arrange
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            Toy robotToy = new RobotToy();

            // Act
            robotToy.play();

            // Assert
            assertEquals("Robot is walking and talking!" + System.lineSeparator(), outputStream.toString());

            // Cleanup
            System.setOut(System.out);
        }
    }
}