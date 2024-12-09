package Week8.src;

import java.util.ArrayList;
import java.util.Arrays;

public class demo2darrays {
  public static void main(String[] args) {
    // 1-d array
    int[] arr = new int[] {2, 100, 1};
    // 2-d array
    int[][] arr2 = new int[][] {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}};
    // 1 2 3, i=0
    // 4 5 6, i=1
    // 0 0 0, i=2
    String[][] strarr = new String[][] {{"Lau", "Wing"}, {"Vanessa", "Lau"}};

    System.out.println(arr2[1][2]);
    for (int i = 0; i < strarr.length; i++) {
      System.out.println(Arrays.deepToString(strarr));
      for (int j = 0; j < strarr[i].length; j++) {
        System.out.println(strarr[i][j]);
      }
    }

    ArrayList<String> listarr = new ArrayList<String>();
    listarr.add("Lau");
    listarr.add("Wing");
    listarr.add("Hong");
    listarr.add("Hong");
    System.out.println(listarr.toString());
    System.out.println(listarr.size());
    System.out.println("---------------");
    ArrayList<String> delarr = new ArrayList<String>();
    delarr.add("Hong");
    listarr.removeAll(delarr);
    System.out.println(listarr.toString());
    System.out.println(listarr.size());

    System.out.println("---------------");

    String[][] twoarr = new String[][]{{"a","b","c"},{"d","e","f"}};
    System.out.println(Arrays.deepToString(twoarr));
    // String a = "hong";
    // a.toCharArray();
    // a.charAt(0)
    // char b ='a';
    // a = (String)b;
  }

}
