package Bigtwo.Week7;

public enum orderstatus {
   ORDACK(1), //
   ORDERPENDING(2), //
   PENDINGDELIVER(3),//
   DELIVERED(4),//
   INVOICE(5),;

  private int value;

  private orderstatus(int value){
    this.value=value;
  }
  public int getvalue(){
    return this.value;
  }
  public orderstatus next() { 
    for (orderstatus status:orderstatus.values()){
      if (this.value+1 == status.getvalue()) {
        return status;
      }
    }
    return this;
  }

  public static void main(String[] args) {
    // for (orderstatus status:orderstatus.values()) {
    //   System.out.println(status);  // toString()
    //   System.out.println(status.name()); // return String format for enum value
    // }
    //System.out.println(orderstatus.values());
    System.out.println(orderstatus.ORDERPENDING.next());
    System.out.println(orderstatus.ORDACK.next());
    
    System.out.println(orderstatus.ORDACK.ordinal());
    System.out.println(orderstatus.ORDERPENDING.ordinal());
    System.out.println(orderstatus.PENDINGDELIVER.ordinal());
    System.out.println(orderstatus.DELIVERED.ordinal());
    System.out.println(orderstatus.INVOICE.ordinal());

    // valueof() -> static method
    // find the enumm object, which has the same name you provided
    System.err.println(orderstatus.valueOf("ORDACK").next());

  }
}
