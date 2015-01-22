/*@author Rebecca Brunsberg
 * 20th January 2015
 * */

public class Duck implements BarnyardAnimal{
  
  int swimSpeed;
  
  public Duck(int swimSpeed){
    this.swimSpeed = swimSpeed;
  }
  @Override
  public void greetFarmer() {
    System.out.println("Quack, quack!");
  }
  
  @Override
  public String toString(){
    return ("A duck is a small waterbird with webbed feet. It has waterproof feathers.");
    
  }
  
  public int compareTo(Duck d) {
    if (this.swimSpeed == d.swimSpeed) return 0;
    if (this.swimSpeed < d.swimSpeed) return -1;
    return 1;
 }
  
}