package HongtestProdWeb;

public class Cart {
  private ITProduct itproduct;
  private Cloth clothproduct;
  private int qty;
  private String productype;

  public Cart(String prodtype, Cloth inCloth, ITProduct inItprod, int inqty){
    if (prodtype == "IT") this.itproduct=inItprod;
    else this.clothproduct=inCloth;
    this.qty=inqty;
    this.productype=prodtype;
  }

  public String getitem(){
    if (this.productype=="IT"){
      return this.itproduct.getITProductdesc();
    }
      else{
      return this.clothproduct.getClothProductdesc();
    }
  }

  public double getitemprc(){
    if (this.productype=="IT"){
      return this.itproduct.getITProdPrice();
    }
    else {
      return this.clothproduct.getClothProdPrice();
    }
  }

  public double getitemqty(){
    return this.qty;
  }

  public double getitemAmt(){
    if (this.productype=="IT"){
      return this.itproduct.getITProdPrice()*this.qty;
    }
    else {
      return this.clothproduct.getClothProdPrice()*this.qty;
    }
  }
  
}
