

public class StringBox { // Simulate Stringbuild.class
  private char[] chs;

  public StringBox(String s){
    this.chs = s.toCharArray();
  }

  public char charAt(int idx){
    return this.chs[idx];
  }
    
  public void Append(String s){
    int endpos = this.chs.length + s.length();
    char[] temp = new char[this.chs.length+s.length()];
    char[] tmps = new char[s.length()];
    tmps = s.toCharArray();
    for (int i=0; i<this.chs.length; i++){
      temp[i]=this.chs[i];
    }
    for (int i=this.chs.length; i<endpos; i++){
      temp[i]=tmps[i-this.chs.length];
    }
    this.chs=temp;
    System.out.println(this.chs);
  }

  public static void main(String[] args) {
    StringBox a = new StringBox("Hong1234");
    System.err.println(a.charAt(3));
    a.Append("Cyruslalalala");

  }
  }
