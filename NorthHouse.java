/**
 * This class is a North House, which is a kind of House
 * @author Kristen McClelland
 * @version 1.0
 */
public class NorthHouse extends House {
    // instance variables
    private ColdResistance coldResistance;
    private boolean wargAbility;
    /**
     * This constructor creates a NorthHouse object with a
     * name, motto, number of Knights, degree of cold
     * resistance, and whether or not it has a warg
     * ability
     * @param name String name of this NorthHouse
     * @param w String motto of this NorthHouse
     * @param c int number of knights this NorthHouse has
     * @param cold enum representing the degree of coldResistance
     * this NorthHouse has
     * @param warg boolean representing whether this NorthHouse
     * has warg ability or not
     */
    public NorthHouse(String name, String w, int c,
        ColdResistance cold, boolean warg) {
        super(name, w, c);
        coldResistance = cold;
        wargAbility = warg;
    }
    /**
     * Returns a String representation of this NorthHouse
     * @return returns a String representation of this NorthHouse
     */
    @Override
    public String toString() {
        String str = "North " + super.toString() + " Has "
            + coldResistance + " coldResistance.";
        if (wargAbility) {
            str = str + " Does have warg abilities.";
        } else {
            str = str + " Does not have warg abilities.";
        }
        return str;
    }
}