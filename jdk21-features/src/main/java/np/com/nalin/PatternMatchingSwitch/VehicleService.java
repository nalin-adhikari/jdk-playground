package np.com.nalin.PatternMatchingSwitch;

public class VehicleService {
    
    public static String describeVehicle(Vehicle vehicle) {
        return switch (vehicle) {
            case Car c when c.seats() > 4 ->
                    "Large car: " + c.brand() + " with " + c.seats() + " seats";

            case Car c ->
                    "Standard car: " + c.brand() + " with " + c.seats() + " seats";

            case Truck t when t.loadCapacity() > 5000 ->
                    "Heavy-duty truck: " + t.brand() + " (" + t.loadCapacity() + "kg capacity)";

            case Truck t ->
                    "Light truck: " + t.brand() + " (" + t.loadCapacity() + "kg capacity)";

            case ElectricScooter s when s.isRented() ->
                    "Rented scooter: " + s.brand();

            case ElectricScooter s ->
                    "Available scooter: " + s.brand();

            // Exhaustive: all permitted subtypes handled, no default needed
        };
    }
}
