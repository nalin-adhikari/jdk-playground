package np.com.nalin.RecordPatterns;

public class DeliveryService {

    public static String processShipment(Object obj) {
        return switch (obj) {
            case Shipment(Package(String item, double weight),
                          Address(String city, String country))
                    when country.equals("Australia") ->
                    "Deliver " + item + " (" + weight + "kg) to " + city + ", AU";

            case Shipment(Package(String item, double weight),
                          Address(String city, String country)) ->
                    "International delivery: " + item + " to " + city + ", " + country;

            default -> "Unknown shipment type";
        };
    }
}
