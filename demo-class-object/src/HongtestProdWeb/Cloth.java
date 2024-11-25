package HongtestProdWeb;

import java.util.Random;

public class Cloth extends ItemMaster {
    
  private String Itemclass;
  private String Season;

  public Cloth(String itemname, String itemdesc, double price, int warantperiod, String season){
    super(itemname, itemdesc, price, warantperiod);
    this.Itemclass = "Cloth";
    this.Season = season;
  }

  public String getClothProductdesc(){
    return "Item Class: " + this.Itemclass + "Item Name: "+ //
           super.getItemname() + "  Description" + //
           super.getItemDesc() + "  Season of Product: " + this.Season;
  }

  public double getClothProdPrice(){
    return super.getPrice();
  }

  public void Chgprice(double price){
    super.setPrice(price);
  }

  public static void Addcloth(Cloth[] cloth1) {

    //Cloth[] cloth1 = new Cloth[10];
    Random ran = new Random();
    //System.out.println(ran1.nextDouble());
    for (int i=0; i<cloth1.length; i++){
       cloth1[i] = new Cloth("CLOTH_PRD "+i, "; Cloth Product "+i, ran.nextDouble()*200, 180, "Fall");      
    }

    for (int i=0; i<10; i++){
      //System.out.println(cloth1[i].getClothProductdesc());
      //System.out.println(cloth1[i].getClothProdPrice());
     }

  }
    
  
}