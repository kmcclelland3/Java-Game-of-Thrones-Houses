/**
 * This class is a DragonLord, which is a type of Nobility object
 * @author Kristen McClelland
 * @version 1.0
 */
public class DragonLord extends Nobility {
    private boolean isFireResistant;
    private int dragonCount;
    /**
     * This constructor creates a DragonLord object with a
     * name, whether it is fire resistant, and how many
     * dragons it has
     * @param n String name of the DragonLord
     * @param fire boolean representing whether this DragonLord
     * is fire reistant or not
     * @param dragons int representing how many dragons this
     * DragonLord has
     */
    public DragonLord(String n, boolean fire, int dragons) {
        super(n);
        isFireResistant = fire;
        dragonCount = dragons;
    }
    /**
     * Returns a string representation of this DragonLord
     * @return String representation of the DragonLord
     */
    @Override
    public String toString() {
        String str = "DragonLord " + super.toString() + " Has "
            + dragonCount + " dragons.";
        if (isFireResistant) {
            str = str + " Is fire resistant.";
        } else {
            str = str + " Isn't fire resistant.";
        }
        return str;
    }
}