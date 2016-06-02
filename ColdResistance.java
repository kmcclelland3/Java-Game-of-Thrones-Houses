/**
 * This ColdResistance has three levels of resistance:
 * Low, Medium, High
 * @author Kristen McClelland
 * @version 1.0
 */
public enum ColdResistance {
    LOW, MEDIUM, HIGH;

    /**
     * Returns a String representation of ColdResistance
     * @return String representation of ColdResistance
     */
    @Override
    public String toString() {
        return name().toUpperCase();
    }
}