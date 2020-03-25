package marekcz;

import java.util.List;

public class main {
    public static void main(String[] args){

        Player marek = new Player("Marek",2000,2000,4000,"katana");

        List<String> marekSave = marek.write();

        for (String s : marekSave) System.out.println(s);

        marek.setWeapon("dual sword");
        marek.setAttackPoints(20);

        System.out.println(marek.toString());

        marek.load(marekSave);

        System.out.println(marek.toString());

//        Enemy warewolf = new Enemy("Scraffy",5,5);
        ISavable warewolf = new Enemy("Scraffy",5,5);

        System.out.println(warewolf.toString());

        List<String> warewolfSave = warewolf.write();
        ((Enemy)warewolf).setName("Fifi");
        ((Enemy)warewolf).setHitPoints(9999);
        ((Enemy)warewolf).setStrength(9888);

        System.out.println(warewolf.toString());
        warewolf.load(warewolfSave);
        System.out.println(warewolf.toString());






    }
}
