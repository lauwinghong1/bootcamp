
public class Demomath111 {
  public static void main(String[] args) {
    System.out.println(Math.PI);

    double cubeVolume = Math.pow(9.0, 3.0);
    System.out.println(cubeVolume);

    int[] a = new int[] {4,5,56,2,128};
    int max = Integer.MIN_VALUE;
    for (int i=0; i<a.length; i++){
       max = Math.max(a[i], max);
    }
     System.out.println("max=" + max);

     System.out.println(Math.round(3.14159));
     System.out.println(Math.round(3.54));
     double aa = 3.5667423545;
     aa = Math.round(aa*1000);
     aa = aa/1000;
     System.out.println(aa);
  }
  
}
