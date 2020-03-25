package marekcz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player extends GameCharacter {

    private int attackPoints;
    private String weapon;

    public Player(String name, int hitPoints, int strength, int attackPoints,String waepon) {
        this.setName(name);
        this.setHitPoints(hitPoints);
        this.setStrength(strength);
        this.attackPoints = attackPoints;
        this.weapon=waepon;
    }

    public Player(String name) {
        this(name,100,10,0,"Melee");
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() +
                ", attackPoints=" + attackPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }




    @Override
    public List<String> write() {
        List<String> object2StringArray = new ArrayList<String>();

        //object2StringArray.add("name");
        object2StringArray.add(getName());
        //object2StringArray.add("name");
        object2StringArray.add(Integer.toString(getHitPoints()));
        object2StringArray.add(Integer.toString(getStrength()));
        object2StringArray.add(Integer.toString(attackPoints));
        object2StringArray.add(weapon);

        return object2StringArray;
    }

    @Override
    public void load(List<String> savedObject) {
        if(savedObject!=null && savedObject.size()>0) {
            Iterator<String> iterator = savedObject.iterator();
            setName(iterator.next());
            setHitPoints(Integer.parseInt(iterator.next()));
            setStrength(Integer.parseInt(iterator.next()));
            this.attackPoints = Integer.parseInt(iterator.next());
            this.weapon = iterator.next();
        }
    }
}
