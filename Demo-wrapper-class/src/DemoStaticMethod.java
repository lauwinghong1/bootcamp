public class DemoStaticMethod {
  public static void main(String[] args) throws Exception{
    int result = sum(3, 2);
    System.out.println(result);
    System.out.println(sum(6,7));
    System.out.println(concat("Hong", "Lau"));
    System.out.println(findMax(new int[] {1, 100}));
    System.out.println("Rantangle area: " + rectanglearea(6,7));
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

}

