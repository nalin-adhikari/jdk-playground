package np.com.nalin.PatternMatchingSwitch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleServiceTest {
    
    @Test
    void testLargeCar() {
        Vehicle car = new Car("Toyota", 7);
        String result = VehicleService.describeVehicle(car);
        assertEquals("Large car: Toyota with 7 seats", result);
    }

    @Test
    void testStandardCar() {
        Vehicle car = new Car("Mazda", 4);
        String result = VehicleService.describeVehicle(car);
        assertEquals("Standard car: Mazda with 4 seats", result);
    }

    @Test
    void testHeavyTruck() {
        Vehicle truck = new Truck("Volvo", 8000);
        String result = VehicleService.describeVehicle(truck);
        assertEquals("Heavy-duty truck: Volvo (8000.0kg capacity)", result);
    }

    @Test
    void testLightTruck() {
        Vehicle truck = new Truck("Isuzu", 3000);
        String result = VehicleService.describeVehicle(truck);
        assertEquals("Light truck: Isuzu (3000.0kg capacity)", result);
    }

    @Test
    void testRentedScooter() {
        Vehicle scooter = new ElectricScooter("Segway", true);
        String result = VehicleService.describeVehicle(scooter);
        assertEquals("Rented scooter: Segway", result);
    }

    @Test
    void testAvailableScooter() {
        Vehicle scooter = new ElectricScooter("Xiaomi", false);
        String result = VehicleService.describeVehicle(scooter);
        assertEquals("Available scooter: Xiaomi", result);
    }
}
