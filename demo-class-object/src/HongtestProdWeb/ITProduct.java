package HongtestProdWeb;

import java.util.Random;

public class ITProduct extends ItemMaster {
  private String Itemclass;
  private int YearofProduct;
  public int ITProductCnt;

  public ITProduct(String itemname, String itemdesc, double price, int warantperiod, int yearofproduct){
    super(itemname, itemdesc, price, warantperiod);
    this.Itemclass = "IT Products";
    this.YearofProduct = yearofproduct;
  }

  public String getITProductdesc(){
    return "Item Class: " + this.Itemclass + "Item Name: "+ //
           this.getItemname() + "  Description" + //
           this.getItemDesc() + "  Year of Product: " + this.YearofProduct;
  }

  public double getITProdPrice(){
    return this.getPrice();
  }

  public void Chgprice(double price){
    this.setPrice(price);
  }
    
  public static void AddITProd(ITProduct[] it1) {
    //ITProduct[] it1 = new ITProduct[10];

    Random ran = new Random();
    //System.out.println(ran1.nextDouble());
    for (int i=0; i<it1.length; i++){
       it1[i] = new ITProduct("ITPRD "+i, "; IT Product "+i, ran.nextDouble(), 180, 2020+i);      
    }

    for (int i=0; i<10; i++){
      //System.out.println(it1[i].getITProductdesc());
      //System.out.println(it1[i].getITProdPrice());
    }
  }
  
}
