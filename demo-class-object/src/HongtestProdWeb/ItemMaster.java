package HongtestProdWeb;

public abstract class ItemMaster {

  private String ItemName;
  private String ItemDesc;
  private double Price;
  private int Warantyperiod;

  public ItemMaster(String itemname, String itemdesc, double price, int warantperiod){
    this.ItemName=itemname;
    this.ItemDesc = itemdesc;
    this.Price = price;
    this.Warantyperiod=warantperiod;
  }

  public String getItemname(){
    return this.ItemName;
  }

  public String getItemDesc(){
     return this.ItemDesc;
   }
  public double getPrice(){
     return this.Price;
   }
  // public abstract String getItemDesc();
  // public abstract double getPrice();

  public int getWarranty(){
    return this.Warantyperiod;
  }

  public void setPrice(double price){
    this.Price = price;
  }

  
}
