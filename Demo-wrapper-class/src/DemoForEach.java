public class DemoForEach {
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3,4};
    for (int i=0; i<=arr.length-1; i++) {
       System.out.println(arr[i]);
    }
    for (int i: arr){
      System.out.println(i);
    }

    String[] arr2 = new String[] {"Hello", "xxx", "apple"};
    String result="";
    for (String a: arr2 ) {
        result = result + a;
    }
    System.out.println(result);

    // "aaaaaabbyabrs"
    // Find out which character appear the most number of times
    String source = "aaaaabbyabrszz";
    int[] arr10 = new int[26];
    for (int i=0; i<source.length(); i++) {
       arr10[source.charAt(i)-97]++;
    }
    int max=0;
    int index=0;
    for (int i=0; i<26; i++) {
        if (arr10[i]>max) {
          max=arr10[i];
          index = i;
        } 
    }
    index+=97;
    System.out.println("The most of time of character is: " + (char)index);
  }
}
