package DemoStaticMethod;

public class Product {
  private String productname;
  private double price;

  public String getProductname(){
    return this.productname;
  }
  public double getPrice(){
    return this.price;
  }
  public void setProductname(String product){
    this.productname=product;
  }
  public void setPrice(double price) {
    this.price=price;
  }
}
