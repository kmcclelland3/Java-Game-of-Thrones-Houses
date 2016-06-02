/**
 * This is a Westerland House, which is a find of House
 * @author Kristen McClelland
 * @version 1.0
 */
public class WesterlandHouse extends House {
    // instance variables
    private int goldCount;
    /**
     * This constructor creates a WesterlandHouse object
     * with a name, motto, number of knights, and quantity
     * of gold
     * @param name String name of this WesterlandHouse
     * @param w String motto of this Westerland House
     * @param c int number of knights of this Westerland House
     * @param gold int quantity of gold this Westlerand House
     * has
     */
    public WesterlandHouse(String name, String w, int c,
        int gold) {
        super(name, w, c);
        goldCount = gold;
    }
    /**
     * Returns String representation of this WesterlandHouse
     * @return returns a String representation of this
     * WesterlandHouse
     */
    @Override
    public String toString() {
        return "Westerland " + super.toString() + " Has "
            + goldCount + " gold coins.";
    }
}