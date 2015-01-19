public class Shark implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Nomnomnom");
	}
	
	@Override
	public String toString() {
		return "The shark does not really belong in a Barnyard.";
	}

}
