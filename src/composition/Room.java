package composition;

public class Room {
    /**
     * Create a single room of a house using composition.
     * Think about the things that should be included in the room.
     * Maybe physical parts of the house but furniture as well
     * Add at least one method to access an object via a getter and then that objects public method as you saw in the previous video
     * then add at least one method to hide the object e.g. not using a getter
     * but to access the object used in composition within the main class like you saw in this video.
     */
    private Television theTelevision;
    private Table theTable;
    private Couch theCouch;
    private Carpet theCarpet;

    public Room(Television theTelevision, Table theTable, Couch theCouch, Carpet theCarpet) {
        this.theTelevision = theTelevision;
        this.theTable = theTable;
        this.theCouch = theCouch;
        this.theCarpet = theCarpet;
    }

    public Television getTheTelevision() {
        return theTelevision;
    }

    public Table getTheTable() {
        return theTable;
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public Carpet getTheCarpet() {
        return theCarpet;
    }
}

