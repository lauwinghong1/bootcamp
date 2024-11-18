import java.math.BigDecimal;

public class SuperDecimal extends BigDecimal{
  public SuperDecimal(double a){
    super(a);
  }
  
  @Override
  public int intValue(){
    // super.doubleValue() -> In the current object, "super" is a keyword to find parameter
    // super.doubleValue() -> 3.3 -> ceil() -> 4.0 -> (int) -> 4
    return (int) Math.ceil(super.doubleValue());
  }

  public static void main(String[] args) {
    BigDecimal a = new BigDecimal(4.222);
    SuperDecimal b = new SuperDecimal(3.3);
    System.out.println(b.intValue());

    System.out.println(a.add(b));

  }
}
