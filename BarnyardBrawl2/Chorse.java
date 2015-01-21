/*
 * Implements the BarnyardAnimal interface in a manner befitting a horse.
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

	@Override
	public int compareTo(Object o) {
		  Chorse other = (Chorse) o;
		  if (this.height == other.height) return 0;
		  if (this.height <= other.height) return -1;
		  return 1;
	}
}
