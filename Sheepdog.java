
public class Sheepdog implements BarnyardAnimal {
	@Override
	public void greetFarmer() {
		System.out.println("Woof! Woof");
	}
	
	@Override
	public String toString() {
		return "The sheepdog is a responsible leader, manages the sheep very well.";
	}
}
