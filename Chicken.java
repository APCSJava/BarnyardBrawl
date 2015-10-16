public class Chicken implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("I am a chicken");
	}
	
	@Override
	public String toString() {
		return "The chicken is a loveable albeit dimwitted provider of eggs";
	}

}
