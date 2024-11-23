package HongtestProdWeb;

import java.util.Random;

public class Productlist {
  public static void main(String[] args) {

    ITProduct[] itProductlist = new ITProduct[10];
    Cloth[] Clothlist = new Cloth[10];
    ITProduct.AddITProd(itProductlist);
    Cloth.Addcloth(Clothlist);

    Random ran = new Random();
    int noOfOrderLine = ran.nextInt(10)+1;
    //System.out.println(noOfOrderLine);
    String prodtype = "";
    Cart[] order = new Cart[noOfOrderLine];
    for (int i=0; i<noOfOrderLine; i++){
      int productno = ran.nextInt(10);
      int type = ran.nextInt(2)+1;
      int qty = ran.nextInt(501);
      System.out.println(productno);
      System.out.println(itProductlist[productno].getITProductdesc());
      System.out.println(Clothlist[productno].getClothProductdesc());
      switch (type) {
        case 1:
          prodtype="IT";
          order[i]=new Cart(prodtype, null, itProductlist[productno], qty);
          break;
        case 2:
          prodtype="Cloth";
          order[i]=new Cart(prodtype, Clothlist[productno], null, qty);
      }
    }

    for (int i=0; i<noOfOrderLine; i++){
      System.out.println("#"+i);
      System.out.println("    "+ order[i].getitem());
      System.out.println("    Price:" + order[i].getitemprc());
      System.out.println("    Qty  :" + order[i].getitemqty());
      System.out.println("    Amt  :" + order[i].getitemAmt());
      System.out.println();
    }  

  }
}
