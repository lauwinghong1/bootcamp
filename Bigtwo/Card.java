package Bigtwo;

import java.util.Objects;

// ! For custom class, always override toString(), equals(), hashCode()
public class Card {
  public static final char[] SUITS=new char[] {'♠', '♡', '♢', '♣'};
  public static final char[] RANKS=new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
  private char rank;   // 13
  private char suit;   // 4

  public Card(char rank, char suit){
    this.rank=rank;
    this.suit=suit;
  }

  public char getRank(){
    return this.rank;
  }
  public char getSuit(){
    return this.suit;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (!(obj instanceof Card)) return false;
    Card card = (Card) obj;
    return Objects.equals(card.getRank(), this.rank) //
          && Objects.equals(card.getSuit(), this.suit);
  }

  @Override
  public String toString(){
    return "Card[" //
      + "[" + this.suit //
      + " " + this.rank //
      + "]";
  
  }
  // hashCode() should be paired with equals() 
  // by default, Object.hashCode() returns an int value representing the object reference
  @Override
  public int hashCode() {
  return Objects.hash(this.rank, this.suit);
  }
}
