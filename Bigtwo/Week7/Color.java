package Bigtwo.Week7;

public enum Color {
  RED('R'), //
  YELLOW('Y'), //
  BLACK('B'), //
  WHITE('W'), //
  ;

  private char value;

  // enum has constructor
  // For enum, you can use "private" for constructor
  private Color(char value) {
    this.value = value;
  }

  private char getValue() {
    return this.value;
  }

  private void setValue(char value) {
    this.value = value;
  }

  public char combineColor(Color value){
    int a = (int)this.value + (int)value.getValue();
    char c= (char) a;
    return c;
  }

  // Everytime you press the "Run" button:
  // 1. Load the classes into memory
  // (For enum, JVM will help create an unique object before executing the method)
  // In memory, there are only 3 color object, RED, YELLOW and BLACK

  public static void main(String[] args) {
    // Never to create enum object by manual (you)
    Color red = Color.RED;
    Color red2 = Color.RED;
    // Color hong = new Color("U"); //Cannot instantiate the type Color
    Color hong = Color.WHITE;
    System.out.println(red == red2);

    if (red == Color.BLACK) { // We always use "==" to compare enum value
      System.out.println("It is black");
    } else {
      System.out.println("It is not black");
    }

    if (red.equals(Color.RED)) { // We never use .equals in enum
      System.out.println("It is red");
    } else {
      System.out.println("It is not red");
    }
    System.out.println(red2.getValue());
    System.out.println(Color.RED.getValue());
    System.out.println(hong.getValue());
    red2.setValue('U');
    System.out.println(red2.combineColor(Color.YELLOW));

  }

}
