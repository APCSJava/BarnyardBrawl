/*
 * Implements the BarnyardAnimal interface in a manner befitting a horse.
 * 
 * @author Christopher Vann
 * @version 20 January, 2015
 */
 
public class Falcon implements BarnyardAnimal {

 @Override
 public void greetFarmer() {
  System.out.println("Skreeee!");
 }
 
 @Override
 public String toString() {
  return "The falcon is lithe and deadly, the fastest animal in the world.";
 }

}
