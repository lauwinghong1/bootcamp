public class DemoStaticMethod {
   private int name;

   public void writeln(int name){
    this.name=name;
    System.out.println("Object writeln=>" + this.name);
  }

  public static void main(String[] args) throws Exception{
    DemoStaticMethod mth01 = new DemoStaticMethod();
    int result = sum(3, 2);
    System.out.println(result);
    System.out.println(sum(6,7));
    System.out.println(concat("Hong", "Lau"));
    System.out.println(findMax(new int[] {1, 100}));
    System.out.println("Rantangle area: " + rectanglearea(6,7));
    mth01.writeln(result);
  }


  // f(x)  =y
  // y = a+b
  public static int sum(int a, int b) {
    return a+ b;
  }

  public static String concat(String a, String b) {
    return a.concat(b);
  }

  public static int findMax(int[] arr){
    int max=Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++) {
      if (arr[i]>max) max=arr[i];
    }
    return max;
  }

  public static int rectanglearea(int length, int width) {
    return length * width;
  }

  public static String subst(String s, int strpos, int endpos){
    return s.substring(strpos, endpos+1);
  }

  public static String replace(String s, char frmchr, char tochr){
    String targetvar;
    for (int i=1; i<s.length(); i++) {
      if (s.charAt(i) == frmchr) {
        targetvar = targetvar + tochr;
      }
        else targetvar = targetvar + s.charAt(i);
    }
    return targetvar;
  }
}

