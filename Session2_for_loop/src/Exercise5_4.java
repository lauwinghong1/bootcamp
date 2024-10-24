public class Exercise5_4 {
  public static void main(String[] args) {
    String inputString = "programming";
    char targetChar = 'a';

    // Objective : Practice : indexOf() , while-loop , if-else

    // Task: Write a program that takes a string and a character as input,
    // and counts how many times the character occurs in the string using indexOf()
    // and a while-loop. Make sure to handle cases where
    // the character is not found.
    
    int pos = 0;
    int count=0;
    pos = inputString.indexOf(targetChar, pos);
    while (pos != -1) {
       count++;
       pos = inputString.indexOf(targetChar, pos+1);
    }
    System.out.println("The character " + targetChar +"' appears " + count +" times." );
  }
}
