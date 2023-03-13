package lecture;

import java.util.ArrayList;
import java.util.List;

public class FighterFactory {
    public ArrayList<Fighter> generateFighters(){


        Fighter fighter1 = new Fighter("Ryu", 17, 12, new ArrayList<>(List.of(
                new Weapon("Throwing Knife","Missile weapon","10 feet", 13,20
        ))));
        fighter1.setName("Ryu");
        fighter1.setHitPoints(17);
        fighter1.setHitPoints(13);
        fighter1.setMaxDamage(10);

        Fighter fighter2 = new Fighter("One Punch Man", 15,15);
        Fighter fighter3= new Fighter("Sailor Moon", 11,9);

        ArrayList<Fighter> fighters = new ArrayList<>(List.of(fighter1,fighter2,fighter3));

        for (Fighter fighter: fighters){
            System.out.println("=============================================");
            System.out.println(fighter.getName() + " has " + fighter.getHitPoints() + "hit points, and can do " +fighter.getMaxDamage()+ " points of max damage.");

            if (fighter.getWeapons() != null){
                System.out.println(fighter.getName() + " uses a " + fighter.getWeapons().get(0).getName() );
                System.out.println("--------------[Weapon]--------------");
                System.out.println("| Name: "+fighter.getWeapons().get(0).getName()
                        +" | Type: "+ fighter.getWeapons().get(0).getType()
                        +" | Range: "+ fighter.getWeapons().get(0).getRange() +"|\n"
                        +"| Hit Points: "+ fighter.getWeapons().get(0).getHitPoints()
                        +" | Max Damage: "+ fighter.getWeapons().get(0).getMaxDamage()+" |\n"
                );
                System.out.println("------------------------------------");

            }

        }
        return  fighters;
    }


}
