import java.util.Scanner;
import java.util.Random;

public class Exercise5_3 {
  public static void main(String[] args) {
    // 1. Randomly generate a number between 1 and 100
    // 2. Prompt the user to guess the number
    // 3. Indicate whether the guess to too high, too low, or correct
    // 4. Continue asking for guess until the guess the correct

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int target = random.nextInt(100)+1;
    int guess = 0;
    Boolean correct=false;

    do {
      System.out.print("Guess a number between 1 and 100: ");
      guess = scanner.nextInt();
      if (guess == target) {
        System.out.println("Bingo!, the number is: " + target);
        correct = true;
        break;
      }
      else if (guess > target) System.out.println("Too high!");
      else if (guess < target) System.out.println("Too low!");
    } while (!correct);

  }
  
}
