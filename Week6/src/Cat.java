public class Cat extends Animal{
  // private int age;
  // private String color;
    
  public Cat(int inage, String incolor){
      //super(age); // call the parent constrcutor
    super(inage, incolor);
  }
  public Cat(){
    super();
    System.out.println("**Empty Cat constructor used");
  }

  public static void main(String[] args) {
    // empty constructor by default call the parent empty constructor
    Cat c1 = new Cat(12, "Neo");
    Cat c2 = new Cat(22, "Ernst");
    Cat c3 = new Cat();
    Cat c4 = new Cat();

    Cat catarr[] = new Cat[]{c1, c2, c3, c4};
    System.out.println(catarr.length);
    // Cat catarr1[] = new Cat[catarr.length+1];
    // Cat c4 = new Cat(20, "Peter");
    // catarr1[catarr.length] = c4;
    // catarr = catarr1;

    for (Cat everycat:catarr){
      System.out.println(everycat.getAge()+" "+everycat.getColor());
    }
    
    //System.out.println(c1.getAge()+" "+c1.getColor());
  } 
}
