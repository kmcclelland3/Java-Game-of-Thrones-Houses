/**
 * This class is a House, which is a type of Nobility
 * @author Kristen McClelland
 * @version 1.0
 */
public class House extends Nobility {
    // instance variables
    protected String words;
    protected int knightCount;
    /**
     * This constructor creates a House object with a
     * name, house motto, and number of Knights
     * @param n String name of this House
     * @param w String motto of this House
     * @param c int number of knights this House has
     */
    public House(String n, String w, int c) {
        super(n);
        words = w;
        knightCount = c;
    }
    /**
     * Returns a String representation of this House
     * @return String representation of the House
     */
    @Override
    public String toString() {
        return "House " + name + ": " + words + ". Has "
            + knightCount + " knights.";
    }
}