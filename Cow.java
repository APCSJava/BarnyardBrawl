/*
 * Implements the BarnyardAnimal interface in a manner befitting a cow.
 * 
 * @author Jordi Albanell
 * @version 20 January, 2015
 */
 
public class Cow implements BarnyardAnimal, Comparable {

   int milkProduced;

 public Cow(int milkProduced){
   this.milkProduced = milkProduced;
 }
  
 @Override
 public void greetFarmer() {
  System.out.println("MOOOOOOOOOOOOOOO");
 }
 
 @Override
 public String toString() {
  return "This cow is so good it will give you enough milk for 50 years";
 }

 public int compareTo(Object o) {
    Cow other = (Cow) o;
    if (this.milkProduced == other.milkProduced) return 0;
    if (this.milkProduced < other.milkProduced) return -1;
    return 1;
 }
}

