import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // 0.2 + 0.1
    System.out.println(0.2+0.1);
    System.out.println(0.1+0.1);

    //Java solution: built-in class
    BigDecimal bd = new BigDecimal(10L);
    BigDecimal bd1 = new BigDecimal("100");
    System.out.println(bd.doubleValue());
    System.out.println(bd1.doubleValue());

    BigDecimal a = BigDecimal.valueOf(0.2);
    BigDecimal b = BigDecimal.valueOf(0.1);
    BigDecimal c1 = a;
    BigDecimal c2 = b;
    System.out.println(c1.add(c2));
    BigDecimal c = a.add(b);
    System.out.println(c);

    //double radius = 4.5;
    //BigDecimal area = new BigDecimal(radius);
    //System.out.println(area.multiply(area).multiply(BigDecimal.valueOf(Math.PI)));

  }
  
}