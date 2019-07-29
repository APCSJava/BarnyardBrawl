
public class Cow implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("moooo");

	}

	@Override
	public String toString() {
		return "The cow eats grass";
	}
}
