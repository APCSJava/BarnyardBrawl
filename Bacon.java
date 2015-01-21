
public class Bacon implements BarnyardAnimal, Comparable {

	private int fatContent; //An int that rates the fattiness of the pig. Values should be between 1 & 10.
	
	public Bacon(int fat) {
		fatContent = fat;
	}
	
	@Override
	public void greetFarmer() {
		System.out.println("Oink oink.");
	}
	
	@Override
	public String toString() {
		return "I am a pig fat and lazy. Bacon";
	}

	public int compareTo(Object o) {
		Bacon other = (Bacon) o;
		
		if (this.fatContent == other.fatContent) return 0; //The pigs are the equally as fat
		else if (this.fatContent >= other.fatContent) return -1; //This pig is fatter
		return 1; //The other pig is fatter
	}
}
