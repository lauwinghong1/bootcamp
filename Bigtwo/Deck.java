package Bigtwo;

import java.util.Random;

public class Deck implements CardOperations {
  private Card[] cards;

  public Deck(){
    this.cards=new Card[52];
    int idx=0;
    for (char suit: Card.SUITS) {
      for (char rank: Card.RANKS) {
        this.cards[idx] = new Card(rank, suit);
        idx++;
      }
    }
    System.out.println("count:"+idx);
  }
  
  public int size(){
    return this.cards.length;
  }

  @Override
  public void shuffle() {
    Card[] shuffcard = new Card[this.cards.length];
    boolean[] cardexist = new boolean[this.cards.length];
    //System.out.println("ddd = " + shuffcard.toString());
    Random ran = new Random();
    int shuff = 0;
    for (int i=0; i<this.cards.length; i++) {
      do {
      shuff = ran.nextInt(this.cards.length);
      } while(cardexist[shuff]);
      //System.out.println(shuff);
      cardexist[shuff]=true;
      shuffcard[i]=this.cards[shuff];
      //System.out.println("scabbled: "+i+" "+shuffcard[i]);
    }
    //System.out.println("scabbled finished");
    this.cards=shuffcard;
    //return shuffcard;
  }

  @Override
  public String toString(){
    String value= "Deck[** ";
    for (Card cardi: this.cards) {
      value += cardi.toString() + ",";
    }
    value += " **]";
    return value;
  }
       
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck.toString());
    deck.shuffle();
    System.out.println("[[**Shuffled**]]");
    System.out.println(deck.toString());

  }
  
}
