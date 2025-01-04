package Week8.src;

public class DemoSwitchExpress {
  public static void main(String[] args) {
    Color color  = Color.YELLOW;
    int x=0;
    switch (color) {
      case RED:
        x =3;
        break;
      case BLUE:
        x = 4;
        break;
      case YELLOW:
        x= 5;
        break;
      default:
        break;
    }

    //Java 14
    // Switch Expression
    int x2 = switch (color){
      case RED -> 3;
      case BLUE -> 4;
      case YELLOW -> 5;
    };
    System.out.println(x2);

    char c = 'a';
    int ascii = switch(c) {
      case 'a'-> {
        System.out.println("a");
        yield 10;
      }
      default -> {
        System.out.println("default");
        yield -1;
      }
    };
    System.out.println(ascii);

  }
  
  public static enum Color {RED,YELLOW,BLUE}
}
