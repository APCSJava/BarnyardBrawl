
public class Duck implements BarnyardAnimal {

	@Override
	public void greetFarmer() {
		System.out.println("Quack!");
		
	}
	
	public String toString(){
		return "The duck is a little quackers";
	}

}
