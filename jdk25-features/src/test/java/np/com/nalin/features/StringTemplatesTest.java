package np.com.nalin.features;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringTemplatesTest {

    @Test
    void testGreet() {
        String name = "World";
        String actual = StringTemplates.greet(name);
        assertEquals("Hello, World!", actual);
    }
}