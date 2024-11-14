public class Circle {  //The class never be private, ALWAYS public
  private String label;
  private static int count=0;
  private String color;
  private int colorradius;
  private static final int RADIUS=10;

  public Circle(String incolor){    //constructor
    this.color = incolor;
    this.label = this.color + "_" + ++Circle.count;
    this.colorradius = Circle.count * RADIUS;
  }
  public String getCircle(){
    return (this.label + " " + this.colorradius);
  }

  public static void main(String[] args) {
    Circle a = new Circle("Red");
    System.out.println(a.getCircle());

    Circle ab = new Circle("Blue");
    System.out.println(ab.getCircle());
  }


}

