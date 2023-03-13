package lecture;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("Ryu");
        fighter1.setHitPoints(17);
        fighter1.setHitPoints(13);
        fighter1.setMaxDamage(10);

        Fighter fighter2 = new Fighter("One Punch Man", 15,15);
        Fighter fighter3= new Fighter("Sailor Moon", 11,9);

        ArrayList<Fighter> fighters = new ArrayList<>(List.of(fighter1,fighter2,fighter3));

        for (Fighter fighter: fighters){
            System.out.println(fighter.getName() + " has " + fighter.getHitPoints() + "hit points, and can do" +fighter.getMaxDamage()+ " points of max damage.");
        }
    }
}
