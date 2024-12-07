package Bigtwo.Week7;

public class lean3248 {
  public static void main(String[] args) {
    int n =2;
    int[][] v = new int[n][n];
    String[] c = new String[] {"UP", "DOWN"};
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        v[i][j] = ((i) * n) + (j);
    }
    int x = 0, y = 0;
    int k = c.size();
    int i = 0;
    while (i < k) {
      if (c[i].equals("UP"))
        x = x - 1;
      else if (c[i].equals("RIGHT"))
        y = y + 1;
      else if (c[i] == "DOWN")
        x = x + 1;
      else
        y = y - 1;
      i++;
    }
    return v[x][y];


  }

}
