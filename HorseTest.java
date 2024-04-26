public class HorseTest {
    public static void main(String[] args) {
        Horse testHorse = new Horse('♘', "Test Horse", 0.9);

        // Test 1: Initial values
        System.out.println("Test 1: Initial Values");
        System.out.println("Name: " + testHorse.getName());
        System.out.println("Symbol: " + testHorse.getSymbol());
        System.out.println("Confidence: " + testHorse.getConfidence());
        System.out.println("Has Fallen: " + testHorse.hasFallen());
        System.out.println("Distance Travelled: " + testHorse.getDistanceTravelled());

        // Test 2: Movement and falling
        System.out.println("\nTest 2: Movement and Falling");
        testHorse.moveForward();
        System.out.println("Distance after moving: " + testHorse.getDistanceTravelled());
        testHorse.fall();
        System.out.println("Has Fallen after fall(): " + testHorse.hasFallen());
        testHorse.moveForward(); // Attempt to move after falling
        System.out.println("Distance after falling (should not increase): " + testHorse.getDistanceTravelled());

        // Test 3: Setter Validations
        System.out.println("\nTest 3: Setter Validations");
        testHorse.setConfidence(1.1); // Invalid set
        System.out.println("Confidence after invalid set (should not change): " + testHorse.getConfidence());
        testHorse.setConfidence(0.8); // Valid set
        System.out.println("Confidence after valid set: " + testHorse.getConfidence());

        // Test 4: Reset and Symbol Change
        System.out.println("\nTest 4: Reset and Symbol Change");
        testHorse.setSymbol('♞');
        testHorse.goBackToStart();
        System.out.println("Symbol after change: " + testHorse.getSymbol());
        System.out.println("Distance after reset: " + testHorse.getDistanceTravelled());
    }
}
