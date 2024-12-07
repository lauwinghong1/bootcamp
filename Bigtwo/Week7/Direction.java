package Bigtwo.Week7;

public enum Direction {
  // private String[] directions = {"east", "south", "west", "north"};
  EAST(1),//
  SOUTH(2),//
  WEST(-1),//
  NORTH(-2),//
  ;

  private final int direction;

  private Direction(int i){
    this.direction=i;
  }

  public int getDirection(){
    return this.direction;
  }

  public boolean isOpposite(Direction direction) {
    return (this.getDirection() + direction.getDirection()==0);
  } 

  public static void main(String[] args) {
    System.out.println(Direction.EAST.getDirection());
    System.out.println(Direction.SOUTH.getDirection());
    System.out.println(Direction.EAST.isOpposite(Direction.WEST));
    System.out.println(Direction.SOUTH.isOpposite(Direction.EAST));
    System.out.println(Direction.NORTH.isOpposite(Direction.SOUTH));
    System.out.println(Direction.NORTH.isOpposite(Direction.WEST));
  }
}
