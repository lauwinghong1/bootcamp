package Week8.src;

public record Book(String author, String title){
  // record, for creating immutable object
  // 1. No setter
  // 2. All-arg construct
  // 3. get
  // 4. No empty constructor
  // 5. Support toString()
  // 6. Support equal()
  // 7. Support hashcode()
  // 8. Support instance and static Customer method
  // 9. Support static variable

  public int titleLength(){
    return this.author.length();
  }

  public static void main(String[] args) {
    Book book = new Book("Hong", "abc");
    System.out.println(book.author());
    System.out.println(book.title());
    System.out.println(book.toString());
    Book book2 = new Book("Hong", "abc");
    System.out.println(book.equals(book2));
    System.out.println(book.hashCode() == book2.hashCode());
    System.out.println(book.titleLength());
  }
}

  

