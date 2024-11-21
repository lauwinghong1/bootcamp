public class PrdElectronic extends Product{
  
  private int WarrantyPeriod;

  public PrdElectronic(String inproduct, double price){
    super(inproduct, price);
    this.WarrantyPeriod = 12;
  }

  @Override
  public String getProductType(){
    return "Electronic";
  }
  
  @Override
  public String toString(){
    return super.toString() + "|| [Elecronic]:"+this.getname() + //
    " Price: " + this.getprice() +  //
    " Warranty: " + this.WarrantyPeriod;
  }

  public static void main(String[] args) {
    PrdElectronic prd1 = new PrdElectronic("TV", 8);
    System.out.println(prd1.getProductType());
    System.out.println(prd1.toString());
  }

}
