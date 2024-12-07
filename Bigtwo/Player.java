package Bigtwo;

public class Player {
    private static Integer IdCounter;
  
    private int id;
    private String name;
    private Deck[] deck;
  
    public Player(String name){
      ++IdCounter;
      this.id=IdCounter;
      this.name=name;
    }

    public int getId(){
      return this.id;
    }

    public String getName(){
      return this.name;
    }

    public Deck[] getCard(){
      return this.deck;
    }
}
