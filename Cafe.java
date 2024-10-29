/* This is a stub for the Cafe class */
public class Cafe extends Building {

    /**
     * attributes req to run a cafe, private so only the cafe itself can access 
     */

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * constructor 
     * @param name of the cafe
     * @param address its address
     * @param nFloors number of floors
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 30;
        this.nCreams = 20;
        this.nCups = 50;
        System.out.println("You have built a cafe: ☕");
    }
    /**
     * method to sell coffee 
     * @param size of the coffee (req coffee ounces)
     * @param sugar amount of sugar packets
     * @param cream amount of cream (whole no.)
     */
    public void sellCoffee(int size, int sugar, int cream) {

        if (this.nCoffeeOunces < size) {
            this.restock();
            throw new RuntimeException("Restocking....");
        } 
        //Sugar
        if (this.nSugarPackets < sugar) {
            this.restock();
            throw new RuntimeException("Restocking....");
        } 
        //Cream
        if (this.nCreams < cream) {
            this.restock();
            throw new RuntimeException("Restocking.....");
        
        } 
        
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= sugar;
        this.nCreams -= cream;
        this.nCups -= 1;
                
        System.out.println("Your coffee is ready");
    }

    /**
     * restocks the inventory to its starting amount
     */

    private void restock(){
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 30;
        this.nCreams = 20;
        this.nCups = 50;
        System.out.println("Inventory restocked.");
    }

    /**
     * main
     * creates object for cafe
     * @param args
     */

    public static void main(String[] args) {
        Cafe c = new Cafe("Compass", "mid-Campus", 1 );
        c.sellCoffee(12, 2,3);
    }
    
}

