public class Cart {

  private Product[] product;
  private int count;

  public Cart(){
    this.product = new Product[0];
    this.count=0;
  }

  public void addProduct(Product product){
    Product[] newarr = new Product[this.product.length+1];
    this.product=newarr;
    this.count++;
  }
  
  public void rmvProduct(){

  }
}
