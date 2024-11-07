public class subtractpructandsum {
  public static void main(String[] args) {
     int a = 124;
     int productofDigit = 1;
     int sumofDigit = 0;
     String stra = String.valueOf(a);
     for (int i=0; i<stra.length(); i++) {
        productofDigit *= ((int)stra.charAt(i)-48);
        sumofDigit += ((int)stra.charAt(i)-48);
     }
     System.out.println(productofDigit);
     System.out.println(sumofDigit);
     System.out.println(productofDigit-sumofDigit);
     
  }
  
}
