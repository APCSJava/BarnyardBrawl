/*
 * Implements the BarnyardAnimal interface in a manner befitting a falcon.
 * 
 * @author Christopher Vann
 * @version 20 January, 2015
 */

public class Falcon implements BarnyardAnimal {
  
  int MAXVELOCITY;
  
   public Falcon(int MAXVELOCITY){
   this.MAXVELOCITY = MAXVELOCITY;
 }
  
  @Override
  public void greetFarmer() {
    System.out.println("Skreeee!");
  }
  
  @Override
  public String toString() {
    return "The falcon is lithe and deadly, the fastest animal in the world.";
  }
  

 // Java 1.7 and beyond
 public int compareTo(Falcon f) {
    if (this.MAXVELOCITY == f.MAXVELOCITY) return 0;
    if (this.MAXVELOCITY < f.MAXVELOCITY) return -1;
    return 1;
 }
}
