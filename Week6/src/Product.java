public abstract class Product {
  private String name;
  private double price; // Encapsulation

  public Product(String inname, double inprice){
    this.name = inname;
    this.price = inprice;
  }

  public String getname(){
    return this.name;
  }

  public double getprice(){
    return this.price;
  }
  public void setProduct(String inname, double inprice){
    this.name = inname;
    this.price = inprice;
  }
  public void chgprice(double inprice){
    this.price=inprice;
  }
  
@Override
public String toString(){
   return "[Product]"+this.name+//
          "Price: " + this.price;
  }
  
public abstract String getProductType();
  
}
