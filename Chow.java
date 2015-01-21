/*
 * Implements the BarnyardAnimal interface in a manner befitting a cow.
 * 
 * @author Nikolas Huth
 * @version 21 January, 2015
 */
public class Chow implements BarnyardAnimal {
	
	private int weight;

	public Chow(int weight) {
		this.weight = weight;
	}

	@Override
	public void greetFarmer() {
		System.out.println("moooo");
	}
	public String toString() {
		return "The cow eats grass";
	}
	public int compareTo(Object a) {
		Chow chow = (Chow) a;
		if(this.weight == chow.weight) {
			return 0;
		}
		else if(this.weight <= chow.weight) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
