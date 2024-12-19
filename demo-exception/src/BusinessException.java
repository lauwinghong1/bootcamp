import javax.print.attribute.standard.Severity;

public class BusinessException extends Exception {
  private int code; 
  private Severity level; //1 low - 3 (high)

  public BusinessException (String message, int code){  
    super(message);
    this.code=code;
    this.level=Severit;
  }
  public BusinessException (String message){
    super(message);
    this.code=1;
  }
}
