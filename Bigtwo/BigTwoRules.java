package Bigtwo;

public class BigTwoRules {
  private static boolean isPair(Card[] card){
    return card.length==2 && (card[0].getRank() == card[1].getRank());
  }
  
  private static boolean isThreeofKind(Card[] card){
    return card.length==3 && //
      (card[0].getRank() == card[1].getRank()) && //
      (card[1].getRank() == card[2].getRank()) ;
  }

  private static boolean isStraight(Card[] card){
    if (card.length != 5) return false;
    bubbleSortCard();
    //sort first
    
  }

  private static void bubbleSortCard(Card[] card) {
    for (int i=0; i<=11; i++){
      for (int j=i+1; j<=12; j++){
        card[i].
      }
    }
  }

  private static int converRanktoNumber(Card card){
    switch (card.getRank()){
      case 'A':
        return 1;
      case 'T':
        return 10;
      case 'J':
        return 11;
      case 'Q':
        return 12;
      case 'K':
        return 13;
      default:
        return card.getRank() -48;
    }
  }
}
