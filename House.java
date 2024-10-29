import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building{

  /**
   * requested attributes for house class which are made private to itself
   */
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
   * constructor
   * @param name of the building - similar to building class
   * @param address its address
   * @param nFloors number of floors
   * @param hasDiningRoom to check if the house has a dining Room or Not
   */

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }
  /**
   * accessor
   * @return the arraylist of Residents
   */
  public ArrayList getResidents(){
    return this.residents;
  }

  /**
   * accessor
   * @return a boolean value for presence/absence of Dining Room
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
   * 
   * @return the number of residents living in the house
   */
  public int nResidents(){
    int nResidents = residents.size();
    return nResidents;
  }

  /**
   * 
   * @param name passes the name of the student to check if they are living there or not
   * @return a boolean value  of true if they are living there, and false if not
   */

  public Boolean isResident(String name){
    if (residents.contains(name)){
      return true;
    }
    else{
      return false;
    }
  }

  /**
   * 
   * @param name of the Student
   * checks if the student of that name is already living there 
   * throws exception if they are
   * adds them to the residents list if not
   */

  public void moveIn(String name){
    if (isResident(name)){
      throw new RuntimeException(name+" already in the house!");
    } else{
      residents.add(name);
      System.out.println(name+" has moved in ");
    }

  }

  /**
   * 
   * @param name of the student
   * checks if they are living there
   * removes if living
   * throws exception if not living
   * @return name of the student who moved out
   */
  
   public String moveOut(String name) {
    if (isResident(name)){
      residents.remove(name);
      System.out.println("Removed.");
      return name;
    }
    else{
      throw new RuntimeException(name+ " doesn't live here.");
    }

  }
  
  /**
   * main
   * creates object for house
   * @param args
   */

  public static void main(String[] args) {
    House h = new House("Talbot", "12 Prospect Street", 4, false);
    h.moveIn("Swiki");
  }

}