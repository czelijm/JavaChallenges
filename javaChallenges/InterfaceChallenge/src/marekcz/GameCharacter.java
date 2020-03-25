package marekcz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameCharacter implements ISavable {

    private String name;
    private int hitPoints;
    private int strength;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
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

        return object2StringArray;
    }

    @Override
    public void load(List<String> savedObject) {
        if(savedObject!=null && savedObject.size()>0) {
            Iterator<String> iterator = savedObject.iterator();
            setName(iterator.next());
            setHitPoints(Integer.parseInt(iterator.next()));
            setStrength(Integer.parseInt(iterator.next()));
        }

    }
}
