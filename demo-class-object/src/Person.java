public class Person {

  private String lastname;
  private String firstname;

  // Constructor:  Constructor Name = Class Name; No return type, Start with Capital letter
  public Person(String firstname, String lastname) {
     this.firstname=firstname;
     this.lastname=lastname;
  }
  public Person() {    //Empty constructor, so that it can be more than 1 constrcutor
    }

  public char getchar(int i){
    return this.lastname.charAt(i);
  }

  public void setLastname(String lastname) {
    this.lastname=lastname;
  }

  public void setFirstname(String firstname) {
    this.firstname=firstname;
  }

  public String getName(){
    return this.lastname + " " + this.firstname;
  }

  // WRONG DESIGN!  ! Static method never use "this."
  public static char getcharstat(int i, Person Person){
    return Person.lastname.charAt(i);
  }

  @Override
  public String toString() {
    return "Person[" //
      + "firstName=" + this.firstname //
      + ", lastname" + this.lastname //
      + "]";
  }

  public static void main(String[] args) {
    // new "Constrtuctor"
    Person p2 = new Person("Vanessa", "Lau");
    Person p1 = new Person();
    p1.setFirstname("Lau");
    p1.setLastname("Hong");
    System.out.println(p1.toString());
    System.out.println(p1);
    System.out.println(p1.getName());
    System.out.println();
    System.out.println(p2.toString());
    System.out.println(p2);
    System.out.println(p2.getName());
    System.out.println(p1.getchar(2));
    System.out.println(p2.getchar(2));
    System.out.println(Person.getcharstat(2, p1));
    System.out.println(Person.getcharstat(2, p2));
  }
}
