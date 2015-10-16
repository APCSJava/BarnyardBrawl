public class HoneyBadger implements BarnyardAnimal {
    
    @Override
    public void greetFarmer() {
        System.out.println("Grrrr");
    }
    
    @Override
    public String toString() {
        return "The honeybadger looks cool when running in slow motion. It likes honey.";
    }
    
}