public class Pig implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.print("Oink oink");
	}
	
	@Override
	public String toString() {
		return "I am a pig, fat and lazy. Bacon."; 
	}
}
