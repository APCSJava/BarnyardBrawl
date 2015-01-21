
public class DogTester {
	public static void main(String[] args) {
		BarnyardAnimal[] animals = new BarnyardAnimal[10];
		animals[0] = new Cdog(5);
		animals[1] = new Cdog(9);

		for (BarnyardAnimal animal : animals) {
			if (animal != null) {
				System.out.println(animal.toString());
				animal.greetFarmer();
			}
		}
		System.out.println(((Cdog) animals[1]).compareTo((Cdog)animals[0]));
	}
}
