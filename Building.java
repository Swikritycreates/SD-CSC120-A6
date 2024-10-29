public class Building {

    /*
     * attributes for building class, its name, address which are protected so their child class can access them but not open to others
     */

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;
    /**
     * constructor
     * @param name is the name of the building
     * @param address is its address
     * @param nFloors are the number of floors
     */

    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * accessor 
     * @return name of the building
     */

    public String getName() {
        return this.name;
    }

    /**
     * accessor
     * @return address of the building 
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * accessor
     * @return the number of floors of the building
     */

    public int getFloors() {
        return this.nFloors;
    }

    /**
     * prints statement consisiting details of the building
     */

    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * main 
     * creates object for building
     * runs methods if req.
     * @param args passess necessary arguments
     */

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
