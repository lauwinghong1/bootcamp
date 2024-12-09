package Week8.src.shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class shape {
  abstract double area();
  
  public static double totalArea(List<shape> shapes) {
    // Use BigDecimal to sum up all shape.area()
    BigDecimal totalArea = BigDecimal.valueOf(0.0);
    for (shape shape:shapes){
      totalArea = totalArea.add(BigDecimal.valueOf(shape.area()));
    }
    return totalArea.doubleValue();
  }

  public static void main(String[] args) {
    List<shape> shapes = new ArrayList<>();
    shapes.add(new Circle(12.8));
    shapes.add(new Square(20));
    shapes.add(new Square(20));
    System.out.println(totalArea(shapes));
  }
}
