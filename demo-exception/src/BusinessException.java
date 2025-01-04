public class BusinessException extends Exception {
  //private Severity level; //1 low - 3 (high)

  public BusinessException (String message, Severity severity){  
    super(message+" "+severity);
    //this.level=severity;
  }

  public BusinessException (String message){
    super(message);
    //this.level=Severity.MEDIUM;
  }
}
