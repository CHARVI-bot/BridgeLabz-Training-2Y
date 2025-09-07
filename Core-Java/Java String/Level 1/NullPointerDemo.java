public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Generating Exception ===");
        try {
            generateException(); 
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(); 
    }
}