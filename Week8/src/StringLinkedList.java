package Week8.src;

public class StringLinkedList {
  private String value;
  private StringLinkedList next;

  public StringLinkedList(String value){
    this.value=value;
  }
  public StringLinkedList(StringLinkedList next){
    this.next=next;
  }
  public void next(StringLinkedList next){
    this.next=next;
  }

  public void add(String value){
    // Find tail
    StringLinkedList tail = this;
    while (tail.next != null){
        tail = tail.next;
    }
    tail.next=new StringLinkedList(value);
  }

  public void remove(String s){
    StringLinkedList head = this;
    StringLinkedList prev = null;
     while (head.next != null){
      if (head.value.equals(s)) {
        if (prev != null){
          prev.next=head.next;
        }
        //else{  ** could not remove the first element
        //  System.out.println("ddd");
        //  this=next;
        //}
        return;
      }
      prev=head;
      head=head.next;
    }

  }
  public String toString(){
    StringLinkedList head=this;
    String str = "StringLinkedList[";
    while (head != null){
      // ...
      str += head.value+",";
      head = head.next;
    }
    str += "]";
    return str;
  }

  public static void main(String[] args) {
    StringLinkedList strings = new StringLinkedList("abc");   //object 1
    //strings.next(new StringLinkedList("def")); 

    strings.add("def");
    strings.add("defddd");
    strings.add("ijk");
    System.out.println(strings.toString());
    strings.remove("def");
    System.out.println(strings.toString());
    strings.remove("defddd");
    System.out.println(strings.toString());

    

  }
  
}
