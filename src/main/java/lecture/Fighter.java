package lecture;

import java.io.Serializable;
import java.util.ArrayList;

public class Fighter implements Serializable { //This object is meant to be instantiated & store
    private int id;
    private String name;
    private int maxDamage;
    private int hitPoints;

    private ArrayList<Weapon> weapons;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public Fighter(){

    }
    public Fighter(String name, int maxDamage, int hitPoints) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
    }


    public Fighter(String name, int maxDamage, int hitPoints, ArrayList<Weapon> weapons) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
        this.weapons = weapons;
    }


}
