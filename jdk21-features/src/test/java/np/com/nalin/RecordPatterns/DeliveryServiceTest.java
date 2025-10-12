package np.com.nalin.RecordPatterns;

public class DeliveryServiceTest {
    public static void main(String[] args) {
        Package pkg1 = new Package("Laptop", 2.5);
        Address addr1 = new Address("Sydney", "Australia");
        Shipment shipment1 = new Shipment(pkg1, addr1);

        Package pkg2 = new Package("Book", 1.0);
        Address addr2 = new Address("Kathmandu", "Nepal");
        Shipment shipment2 = new Shipment(pkg2, addr2);

        System.out.println(DeliveryService.processShipment(shipment1));
        System.out.println(DeliveryService.processShipment(shipment2));
        System.out.println(DeliveryService.processShipment("Random String"));
    }
}
