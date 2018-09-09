package nyc.aisleone;

import java.util.Random;

public class Main {

  /**
   theres 4 enemies and my paladin
   Paladin as 52 hp
   the imps have [[1d20+5]] to hit
   I have ac 19
   so
   they must roll on the d20 a 14 or higher to hit me
   if they hit me assume thay do a specific amount of damage
   which is
   [[1d4+3]] + HALF of [[3d6]]
   On the first turn, they have advantage
   so all 4 roll their attack twice and take the higher value, increasing chance to hit on the first turn
   you then assume that every turn I kill one of them
   so
   you roll the first attack as 4 ims with advantage
   then 3 normal im attacks
   then 2
   then 1
   I want to know 1: how often do I survive 2 how often do I die and 3 how often do I die on what turns
   see how this is alot of math I could do faster with it preprogrammed
   we could get much more ACCURATE but complicated witht his
   by eithe rnot assume I roll perfect con saves agaisnt the poison damage so it isnt half sometimes, and then calculating the rate and which I hit based on my attack score vs their ac, then how many tunrs they tyake to kill on average cause normally they will take 2 turns base don damage average but Im running my simple sim assumign I always save agaisnt poison and assuming i both aways hit and one shot kill an imp every turn
   this sound sciecny?
   **/

  static class Paladin {

    String name;
    int healthPoints;
    int armorClass;

    Paladin(String name, int healthPoints, int armorClass) {
      this.name = name;
      this.healthPoints = healthPoints;
      this.armorClass = armorClass;
    }

    public int getArmorClass() {
      return armorClass;
    }

    public int getHealthPoints() {
      return healthPoints;
    }

    public String getName() {
      return name;
    }
  }

  public static void main(String[] args) {

    Paladin julie = new Paladin("Julie", 52, 19);

    impEncounter(julie, 4);

  }

  private static void impEncounter(Paladin paladin, int numOfEnemies) {
    int firstRoll = rollDice(4,20);
  }

  public static int rollDice(int number, int nSides) {
    int num = 0;
    int roll = 0;
    Random r = new Random();
    if (nSides >= 3) {
      for (int i = 0; i < number; i++) {
        roll = r.nextInt(nSides) + 1;
        System.out.println("Roll is:  " + roll);
        num = num + roll;
      }
    } else {
      System.out.println("Error num needs to be from 3");
    }
    return num;
  }
}
