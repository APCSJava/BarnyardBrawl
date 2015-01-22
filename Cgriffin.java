/*
 * Implements both the BarnyardAnimal interface 
 * and the Comparable interface in a manner befitting 
 * a horse.
 * 
 * @author Kent Collins
 * @version 14 September, 2014
 */
 
public class Cgriffin implements BarnyardAnimal, Comparable {

	int ferocity;

	public Cgriffin(int ferocity){
	  this.ferocity = ferocity;
	}

	@Override
	public void greetFarmer() {
		System.out.println("Raeeeeewwww");
	}
	
	@Override
	public String toString() {
		return "grf ns r so kewl";
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
		  Chorse other = (Cgriffin) o;
		  if (this.ferocity == other.ferocity) return 0;
		  if (this.ferocity < other.ferocity) return -1;
		  return 1;
	}
	
	// Java 1.7 and beyond
	public int compareTo(Cgriffin c) {
		  if (this.ferocity == c.ferocity) return 0;
		  if (this.ferocity < c.ferocity) return -1;
		  return 1;
	}
}
