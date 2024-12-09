package Week8.src.shape;

import java.math.BigDecimal;

public class Square extends shape{
    private double length;

    public Square (double length){
    this.length=length;
  }
  @Override
  public double area(){
    return BigDecimal.valueOf(this.length) //
          .multiply(BigDecimal.valueOf(this.length)) //
          .doubleValue();
  }
  
}
