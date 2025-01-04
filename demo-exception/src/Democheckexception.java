import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Democheckexception {
  public static void main(String[] args) {
    Path filePath = Paths.get("abc.txt");
    List<String> lines = null;
    // Checked Exception: compile fail
    // So, you have to "handle" (try-catch) this exception so that you can compile the program
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("file not found");
    }
    System.out.println(lines);
    int result =0;
    try {
      calculate(-1, 9);  // throw checked excpetion, so we have to try-catch
    } catch (BusinessException e) {
      System.out.println("==>"+e.getMessage());
      result =-1;
    }
  }

  public static int calculate(int x, int y) throws BusinessException { // forward Exception to caller
    if (x < 0 || y < 0) {
      throw new BusinessException("error x and Y cannot < 0", Severity.HIGH);
    }
    return x + y;
  }

}
