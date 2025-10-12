package np.com.nalin.features;

public class InstanceofPatternExample {

    static void test(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("It's an Integer: " + i);
        }
    }
}
