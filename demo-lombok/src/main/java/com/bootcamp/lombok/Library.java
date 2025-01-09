package com.bootcamp.lombok;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Library {
  private List<Book> books;
  public void addbook(Book book){
    this.books.add(book);
  }
  
  @Getter
  @Setter
  @AllArgsConstructor
  public static class Book {
    private int id;
    private String name;
    public int addbook(int id, String name){
      this.id   = id;
      this.name =name;
      return 100;
    }
  }
  
}
