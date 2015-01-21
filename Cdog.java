/*
 * Implements the BarnyardAnimal interface in a manner befitting a dog.
 * 
 * @author Casey Perdue
 * @version 21 January, 2015
 */
 
public class Cdog implements BarnyardAnimal, Comparable<Object> {

	int height;

	public Cdog(int height){
	  this.height = height;
	}

	public void greetFarmer() {
		System.out.println("Bark!");
	}
	
	@Override
	public String toString() {
		return "The dog is fast and agile, capable of much speed.";
	}

	public int compareTo(Object o) {
		  Cdog other = (Cdog) o;
		  if (this.height == other.height) return 0;
		  if (this.height <= other.height) return -1;
		  return 1;
	}
}
