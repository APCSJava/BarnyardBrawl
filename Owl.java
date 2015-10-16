public class Owl implements BarnyardAnimal {
    
    @Override
    public void greetFarmer() {
        System.out.println("Hoo");
    }
    
    @Override
    public String toString() {
        return "It's an owl.";
    }
    
}
