public class Printer<T> {
  private T value;

  public Printer(T value) {
    this.value = value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    Printer<String> stringPrinter = new Printer<>("hello");
    stringPrinter.print(); // hello

    Printer<Integer> integerPrinter = new Printer<>(10);
    integerPrinter.print(); // 10
    // integerPrinter.setValue("abc");
    integerPrinter.setValue(20);
    integerPrinter.print(); // 20

    // ! Generics does not support primitives
    // Printer<int> intPrinter = new Printer<>();

  }
}

