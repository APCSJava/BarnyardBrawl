public class Alpaca implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("*alpaca noises");
	}
	
	@Override
	public String toString() {
		return "The majestic alpaca is useful for fluffiness.";
	}

}