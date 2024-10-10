public class DemoChar {
  public static void main(String[] args) {
    String s = "helloworld";
    String s2 = "H";
    // data type: char which stores single character
    char c = 'A';
    // NO ACCEPT => char c2 + "h";  <= Char uses single quote, String uses double quote
    // char = contains Chinese character (1 character of Chinese no matter non-unique/unique)
    // char variable not support empty c=''
    System.out.println(s+" "+c);

    int Hong = 7;
    boolean isAudlt = Hong >= 18;
    System.out.println(isAudlt);

    // byte -> short -> int -> long -> float -> double
    // byte, short, int, long
    byte b1 = 3;        //8 bits value with sign
    System.out.println(b1);
    //byte value in btween -128 and 127
    b1 = 127;
    b1 = -128;  //cannot convert from int to byte

    short s1= -32768;  //16 bits value with sign (-32768 and 32767)
    s1 = 32767;  
    s1 = -32768; 

    int i1 = -2_147_483_648;  // 32 bits value with sign
    i1 = 2_147_483_647;   // _ is a thousand separator

    long l1 = Long.MAX_VALUE;
    System.out.println(l1);

    int i11 = 6;

    // !! Two special cases that int value can assign to type 
    // that less than int (i.e. type and short)
    byte b10 = 6;
    short s11 = 6; 

    long l12 = 6L;   //number come with character L (declare as Long);  f (declare as float)
    float f12 = 6L;  //number itself / number with d (declare as double)
    System.out.println(f12);
    double d12 =6L;
    System.out.println(d12);
    f12 = 12.6f;

    //System.out.println(l1);                     // 64 bits value with sign

    // int vs char
    // ! char -> int -> long -> float -> double
    char x = '康';
    System.out.println(x);
    System.out.println(x+0); // char+int-> int+int -> int -> 113
    x++;
    x+=10; 
    System.out.println(x);
    System.out.println(x+0);

    int y = 40000;
    char h2 = (char) y;  //enforce it to the certain variable type you need.
    System.out.println(h2); 
  }
}
