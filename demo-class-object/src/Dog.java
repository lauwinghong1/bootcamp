public class Dog {
   private final int age; 
   private int dogage;
   
   static {
    age = 0;
   }

   public Dog(int inage){
    this.dogage=inage*age;
   }
}
