
/**
 * Write a description of class Horse here.
 * 
 * @author Jibril
 * @version (a version number or a date)
 */
public class Horse {
    private String name;
    private char symbol;
    private int distanceTravelled;
    private boolean hasFallen;
    private double confidence;

    // constructor
    public Horse(char horseSymbol, String horseName, double horseConfidence) {
        this.symbol = horseSymbol;
        this.name = horseName;
        this.confidence = horseConfidence;
        this.distanceTravelled = 0;  // Default starting distance
        this.hasFallen = false;      // Default fallen state
    }

    // accessor methods

    //getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public double getConfidence() {
        return confidence;
    }

    public boolean hasFallen() {
        return hasFallen;
    }

    // setters/mutator methods
    public void setSymbol(char newSymbol) {
        this.symbol = newSymbol;
    }

    public void setConfidence(double newConfidence) {
        if (newConfidence >= 0.0 && newConfidence <= 1.0) {
            this.confidence = newConfidence;
        } else {
            System.out.println("Confidence must be between 0.0 and 1.0.");
        }
    }

    // methods
    public void fall() {
        hasFallen = true;
    }

    public void moveForward() {
        if (!hasFallen) {
            distanceTravelled++;
        }
    }

    public void goBackToStart() {
        distanceTravelled = 0;
    }
}
