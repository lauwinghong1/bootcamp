public abstract class Machine {
  private String color;

  public abstract void start();  
  public abstract void stop();
  
  public Machine(String incolor){
    this.color=incolor;
    System.out.println(this.color + " received and recorded");
  }

  public String getcolor(){    
    return this.color;
  }

  // "Final" method cannot be override by the child class
  // Projector.class can access abc() method, but it cannot override it.
  public final int abc(){
    return 3;
  }


}
