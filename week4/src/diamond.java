public class diamond {
  public static void main(String[] args) {
    int max = 99;
     for (int i=1; i<=max; i+=2) {
       for (int k=(max-i)/2; k>=1; k--) System.out.print(" ");
       for (int k=1; k<=i; k++) System.out.print("*");
       System.out.println(); 
     }
    for (int i=max-2; i>=1; i-=2) {
       for (int k=(max-i)/2; k>=1; k--) System.out.print(" ");
       for (int k=1; k<=i; k++) System.out.print("*");
       System.out.println(); 
     }
  }
  
}
