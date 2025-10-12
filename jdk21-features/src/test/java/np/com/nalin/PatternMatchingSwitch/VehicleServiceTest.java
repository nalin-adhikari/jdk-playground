package np.com.nalin.PatternMatchingSwitch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Vehicle Service Tests")
class VehicleServiceTest {
    
    private Vehicle largeCar;
    private Vehicle standardCar;
    private Vehicle heavyTruck;
    private Vehicle lightTruck;
    private Vehicle rentedScooter;
    private Vehicle availableScooter;

    @BeforeEach
    void setUp() {
        largeCar = new Car("Toyota", 7);
        standardCar = new Car("Mazda", 4);
        heavyTruck = new Truck("Volvo", 8000);
        lightTruck = new Truck("Isuzu", 3000);
        rentedScooter = new ElectricScooter("Segway", true);
        availableScooter = new ElectricScooter("Xiaomi", false);
    }

    @Test
    @DisplayName("Should correctly describe a large car")
    void testLargeCar() {
        String result = VehicleService.describeVehicle(largeCar);
        assertEquals("Large car: Toyota with 7 seats", result);
    }

    @Test
    @DisplayName("Should correctly describe a standard car")
    void testStandardCar() {
        String result = VehicleService.describeVehicle(standardCar);
        assertEquals("Standard car: Mazda with 4 seats", result);
    }

    @Test
    @DisplayName("Should correctly describe a heavy-duty truck")
    void testHeavyTruck() {
        String result = VehicleService.describeVehicle(heavyTruck);
        assertEquals("Heavy-duty truck: Volvo (8000.0kg capacity)", result);
    }

    @Test
    @DisplayName("Should correctly describe a light truck")
    void testLightTruck() {
        String result = VehicleService.describeVehicle(lightTruck);
        assertEquals("Light truck: Isuzu (3000.0kg capacity)", result);
    }

    @Test
    @DisplayName("Should correctly describe a rented scooter")
    void testRentedScooter() {
        String result = VehicleService.describeVehicle(rentedScooter);
        assertEquals("Rented scooter: Segway", result);
    }

    @Test
    @DisplayName("Should correctly describe an available scooter")
    void testAvailableScooter() {
        String result = VehicleService.describeVehicle(availableScooter);
        assertEquals("Available scooter: Xiaomi", result);
    }
}
