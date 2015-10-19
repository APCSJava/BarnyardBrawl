public class Cat implements BarnyardAnimal {
    public void greetFarmer() {
        System.out.println((char)27+"[1m The cat looks up, then walks away annoyedly.");
    }
    public String toString() {
        return "The cat is obviously unimpressed.";
    }
    public void herd() {
        System.err.println("You died as the cat scratched you to death.");
        System.exit(1);
    }
}
