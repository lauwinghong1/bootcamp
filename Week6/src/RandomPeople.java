import java.util.Random;
public class RandomPeople {
  public static void main(String[] args) {
   Random rand = new Random();

   int[] people = new int[14];
   for (int i=1; i<=13; i++){
    int rannumber =0;  
    boolean dup=false;
    do {
      rannumber = rand.nextInt(39)+1;
      //System.out.println(rannumber);
      dup=false;
      for (int j=1; j<=i; j++){
        if (people[j]==rannumber || rannumber<18) {
          //System.out.println("#" + rannumber + "incorrected");
          dup=true; 
        }
      }
     } while (dup);
      people[i] = rannumber;
      System.out.println("#"+i+". "+rannumber);
    }
  }
}
