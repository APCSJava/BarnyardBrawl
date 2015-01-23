

public class PigTester {

	public static void main(String[] args) {
		CPig[] pigs = new CPig[10];
		pigs[0] = new CPig(15);
		pigs[1] = new CPig(16);
		pigs[2] = new CPig(15);
		pigs[3] = new CPig(10);
		
		for (BarnyardAnimal animal : pigs) {
			if (animal != null) {
				System.out.println(animal.toString());
				animal.greetFarmer();
			}
		}
		
		compared(pigs[0].compareTo(pigs[1]));
		compared(pigs[0].compareTo(pigs[2]));
		compared(pigs[0].compareTo(pigs[3]));
		compared(pigs[0].compareTo(pigs[0]));
	
	}


public static void compared(int num){
	if (num == -1){
		System.out.println( "Your first pig goes first");
		
	}
	else if (num == 0){
		System.out.println( "Your pigs weigh the same");
		
	}
	else if (num == 1){
		System.out.println("Your second pig goes first");
		
	}
	else{
		
		System.out.println("woops");
	}
	
}
}