package DemoStaticMethod;

public class Supermarket {
  public static void main(String[] args) {
    Product product1 = new Product();
    product1.setProductname("Apple");
    product1.setPrice(10.00);

    Product product2 = new Product();
    product2.setProductname("Orange");
    product2.setPrice(3.00);

    Product product3 = new Product();
    product3.setProductname("Chocolate");
    product3.setPrice(10.00);

    Order ord1 = new Order();
    ord1.setproduct(product1);
    ord1.setQuantity(1,5);

    Order ord2 = new Order();
    ord2.setproduct(product2);
    ord2.setQuantity(2,10);

    Order ord3 = new Order();
    ord3.setproduct(product3);
    ord3.setQuantity(3,10);
   
    //System.out.println(ord1.getTotal());
    //System.out.println(ord2.getTotal());

    Order[] orderarr = new Order[] {ord1, ord2, ord3};
    double ordtotal = 0.0;
    //for (Order order : orderarr) {
    for (Order arr:orderarr) {
        System.out.println(arr.getOrderNum() + " " + //
            arr.getProduct() + " " + arr.getTotal());
        ordtotal += arr.getTotal();
    }
    System.out.println(ordtotal);
  }
}
