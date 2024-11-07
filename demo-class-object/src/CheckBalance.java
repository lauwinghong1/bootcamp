public class CheckBalance {

  public static void main(String[] args) {
    System.out.println(isBalance("24123"));
  }

  public static boolean isBalance(String num){
    //System.out.println(num);
    int oddsum =0;
    int evensum = 0;
    int j=0;
    //System.out.println(num.length());
    for (int i=0; i<num.length(); i++){
       j=i+1;
       if (j%2 == 0) evensum += (int)num.charAt(i)-48;
       else oddsum += (int)num.charAt(i)-48;
     }
    if (oddsum == evensum) return true;
    else return false;
  }
  
}