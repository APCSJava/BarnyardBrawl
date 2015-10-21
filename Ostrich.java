
public class Ostrich implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Iaaaaak");
	}
	
	@Override
	public String toString() {
		return "The ostrich can keep its head in the ground for extended periods of time.";
	}
}
