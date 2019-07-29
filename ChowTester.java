
public class ChowTester {
	public static void main(String[] args) {
		Chow cow = new Chow(12);
		Chow cow2 = new Chow(12);
		
		if(cow.compareTo(cow2) == 0) System.out.println("Success");
		if(cow.compareTo(cow2) == -1) System.out.println("woops");
		
	}
}
