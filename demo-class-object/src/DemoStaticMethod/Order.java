package DemoStaticMethod;

public class Order {
  private int ordernum;
  private Product product;
  private int qtys;

  public void setproduct(Product product){
    this.product = product;
  }

  public void setQuantity(int ordnum, int quantity){
    this.ordernum=ordnum;
    this.qtys=quantity;
  }

  public double getTotal(){
    double total = 0.0;
    total = this.qtys * this.product.getPrice();
    return total;
  }

  public String getProduct(){
    return this.product.getProductname();
  }

  public int getQuantity(int quantity){
      return this.qtys;
  }

  public int getOrderNum(){
    return this.ordernum;
  }

  
}
