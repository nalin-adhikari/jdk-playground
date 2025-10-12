package np.com.nalin.RecordPatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

@DisplayName("Delivery Service Tests")
class DeliveryServiceTest {
    
    private Package laptopPackage;
    private Package bookPackage;
    private Address sydneyAddress;
    private Address kathmanduAddress;
    private Shipment laptopShipment;
    private Shipment bookShipment;

    @BeforeEach
    void setUp() {
        laptopPackage = new Package("Laptop", 2.5);
        bookPackage = new Package("Book", 1.0);
        sydneyAddress = new Address("Sydney", "Australia");
        kathmanduAddress = new Address("Kathmandu", "Nepal");
        laptopShipment = new Shipment(laptopPackage, sydneyAddress);
        bookShipment = new Shipment(bookPackage, kathmanduAddress);
    }

    @Test
    @DisplayName("Should process laptop shipment to Sydney (Australia) correctly")
    void testLaptopShipmentToSydney() {
        String result = DeliveryService.processShipment(laptopShipment);
        assertEquals("Deliver Laptop (2.5kg) to Sydney, AU", result);
    }

    @Test
    @DisplayName("Should process book shipment to Kathmandu (International) correctly")
    void testBookShipmentToKathmandu() {
        String result = DeliveryService.processShipment(bookShipment);
        assertEquals("International delivery: Book to Kathmandu, Nepal", result);
    }

    @Test
    @DisplayName("Should handle invalid shipment input")
    void testInvalidShipmentInput() {
        String result = DeliveryService.processShipment("Random String");
        assertEquals("Unknown shipment type", result);
    }
}
