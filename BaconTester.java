public class BaconTester {

	public static void main(String[] args) {
		
		Bacon fatPig = new Bacon(8);
		Bacon skinnyPig = new Bacon(3);
		
		System.out.println(fatPig.compareTo(skinnyPig));
	}
}
