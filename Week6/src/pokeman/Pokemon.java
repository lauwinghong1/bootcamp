package pokeman;

public abstract class Pokemon {
  private int number;
  private String name;
  private String[] skills;
  private String pokemonType;

  public Pokemon(int number, String name, String pokemontype){
    this.name=name;
    this.number=number;
    this.pokemonType=pokemontype;
    this.skills=new String[4];
  }
  public abstract void leaernMoves(String move);

  public void setSkills(String skill){
    this.skills[3]=skill;
  }

  public int getNumber(){
    return this.number;
  }
  public String getName(){
    return this.name;
  }
  public String getPokemonType(){
    return this.pokemonType;
  }

  public String[] getSkillSet(){
    return this.skills;
  }

  public void skillsets(){
    System.out.println(Arrays.toString(this.skills));

  }
}
