//E2.9
package exercises;

public class ReverseTester {
    public static void main(String[] args) {
        String original = "desserts";
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();

        System.out.println("Expected Result: stressed");
        System.out.println("Actual Result: " + sb.toString());
    }
}

