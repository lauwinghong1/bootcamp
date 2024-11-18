public class Machine_Project extends Machine {
  
  private double size;

  public Machine_Project(double insize, String incolor){
    super(incolor);
    this.size=insize;
  }

  @Override
  public void start(){
    System.out.println("The projector is starting");
  }

  @Override
  public void stop(){
    System.out.println("The projector is stopping");
  }

  public static void main(String[] args) {
  Machine_Project p1 = new Machine_Project(100, "RED");
  System.out.println(p1.getcolor());
  System.out.println(p1.abc());

  
  }
}
