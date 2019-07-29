/*
 * Implements both the BarnyardAnimal interface 
 * and the Comparable interface in a manner befitting 
 * a sheep.
 * 
 * @author Roxy Sammons
 * @version 22 January, 2015
 */
 
public class Baabaa implements BarnyardAnimal, Comparable {

 int fluffy;

 public Baabaa(int fluffy){
   this.fluffy = fluffy;
 }

 @Override
 public void greetFarmer() {
  System.out.println("BaaaaaaaahhhhhhhhhHHHHHHHHH!");
 }
 
 @Override
 public String toString() {
  return "The sheep has a high fluffiness-factor.";
 }

 /**
  * @param o An object to be compared to this sheep
  * 
  * @return -1 if this sheep is less fluffy, 0 if same, 
  * +1 if this horse fluffier
  * 
  * Compatible with Java 1.6 and earlier
  */
 public int compareTo(Object o) {
    Baabaa other = (Baabaa) o;
    if (this.fluffy == other.fluffy) return 0;
    if (this.fluffy < other.fluffy) return -1;
    return 1;
 }
 
}
