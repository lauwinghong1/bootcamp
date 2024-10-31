public class Record {
  private String name;
  private String address;

  public void setname(String namein){
    this.name = namein;
  }
  public String getname(){
    return this.name;
  }
  public void setaddress(String addin){
      this.address = addin;
  }
  public String getaddress() {
      return this.address;  
  }
  public String getrecord(){
    return "Name: " + this.name + "; " + this.address;
  }

  public static void main(String[] args) {
    Record r1 = new Record();
    Record r2 = new Record();

    r1.setname("Lau Wing Hong");
    //recarr[1].setname("Lau Wing Hong 000");
    r1.setaddress("Chai Wan");
    //recarr[1].setaddress("Chai Wan 000");
    r2.setname("Vanessa");
    r2.setaddress("Chai Wan - Precious");
    
    System.out.println(r1.getname() +' '+r1.getaddress());
    System.out.println(r2.getname() +' '+r2.getaddress());
    System.out.println(r1.getname() +' '+r2.getname());
    String output = r1.getrecord()+" "+r2.getrecord();
    System.out.println(output);
  }
  
}
