package lecture;

import java.io.Serializable;
import java.util.ArrayList;

public class Weapon implements Serializable {


    private String name;
    private String type;
    private String range;
    private int maxDamage;
    private int hitPoints;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon(String name, String type, String range, int maxDamage, int hitPoints) {
        this.type = type;
        this.range = range;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
    }
}
