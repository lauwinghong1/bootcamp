package pokeman;

public class FirePokemon extends Pokemon{
  public FirePokemon(int number, String name, String pokentype){
    super(number, name, pokentype);
  }

  @Override
  public void learnSkills(String move){
    for (String skill:this.getSkillSet()) {
      if (move.equals(skill)){
        System.out.println("Cannot leaern same skill");
      }
      this.getSkillSet()[3]=move;
    }
  }
  
}
