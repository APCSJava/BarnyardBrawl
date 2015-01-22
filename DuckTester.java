public class DuckTester {

 public static void main(String[] args) {
  
   Duck fast = new Duck(5);
   Duck slower = new Duck(2);
   Duck fast2 =  new Duck(5);
   
   if (fast.compareTo(slower)==1){
     System.out.println("duck fast is faster than duck slow");
   }
   if (fast2.compareTo(fast)==0){
     System.out.println("duck fast and snail are the same speed");
   }

}
}