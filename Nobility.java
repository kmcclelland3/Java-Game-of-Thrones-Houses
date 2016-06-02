/**
 * This class represents a nobility object in the Game of
 * Thrones universe
 * @author Kristen McClelland
 * @version 1.0
 */
public class Nobility {
    // instance variables
    protected String name;
    /**
     * This constructor creates a Nobility with the name in
     * the paramters
     * @param n name of the Nobility
     */
    public Nobility(String n) {
        name = n;
    }
    /**
     * This method changes the name of this Nobility object
     * @param n new name of the Nobility
     */
    public void setName(String n) {
        name = n;
    }
    /**
     * This method returns a String output for this Nobility
     * object based on the name of the Nobility
     * @return String output of this Nobility's name
     */
    @Override
    public String toString() {
        return name + ".";
    }
}