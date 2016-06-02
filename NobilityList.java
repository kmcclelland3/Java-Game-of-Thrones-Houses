/**
 * This class contains a list of Nobility Objects
 * @author Kristen McClelland
 * @version 1.0
 * I worked on this homework alone, only using class materials.
 */
public class NobilityList {
    // instance variables
    private Nobility[] nobilities;
    private int nobilityCount = 0;
    /**
     * This is the default constructor for NobilityList that
     * uses a chained constructor call to instantiate the list
     * to size 10
     */
    public NobilityList() {
        this(10);
    }
    /**
     * This constructor instatiates a NobilityList to the size
     * specified
     * @param size how long the NobilityList should be initially
     */
    public NobilityList(int size) {
        nobilities = new Nobility[size];
    }
    /**
     * Iterates through the NobilityList to print out the Nobilities
     */
    public void listNobilities() {
        for (int i = 0; i < nobilityCount; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(nobilities[i].toString());
        }
    }
    /**
     * This method adds an additional Nobility to the NobilityList.
     * If the NobilityList is full, it doubles the size of the list
     * before adding the Nobility
     * @param n the Nobility object to be added to the NobilityList
     */
    public void add(Nobility n) {
        if (nobilityCount < nobilities.length) {
            nobilities[nobilityCount] = n;
        } else {
            Nobility[] temp = new Nobility[nobilities.length * 2];
            for (int i = 0; i < nobilities.length; i++) {
                temp[i] = nobilities[i];
            }
            nobilities = temp;
            nobilities[nobilityCount] = n;
        }
        nobilityCount++;
    }
}