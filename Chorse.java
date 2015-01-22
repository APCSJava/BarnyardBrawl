/*
 * Implements both the BarnyardAnimal interface 
 * and the Comparable interface in a manner befitting 
 * a horse.
 * 
 * @author Kent Collins
 * @version 14 September, 2014
 */
 
public class Chorse implements BarnyardAnimal, Comparable {

	int height;

	public Chorse(int height){
	  this.height = height;
	}

	@Override
	public void greetFarmer() {
		System.out.println("Neeiiiighh!");
	}
	
	@Override
	public String toString() {
		return "The horse is sturdy and powerful, capable of much work.";
	}

	/**
	 * @param o An object to be compared to this horse
	 * 
	 * @return -1 if this horse is shorter, 0 if same, 
	 * +1 if this horse taller
	 * 
	 * Compatible with Java 1.6 and earlier
	 */
	public int compareTo(Object o) {
		  Chorse other = (Chorse) o;
		  if (this.height == other.height) return 0;
		  if (this.height < other.height) return -1;
		  return 1;
	}
	
	// Java 1.7 and beyond
	public int compareTo(Chorse c) {
		  if (this.height == c.height) return 0;
		  if (this.height < c.height) return -1;
		  return 1;
	}
}
