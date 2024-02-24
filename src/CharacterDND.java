import java.util.ArrayList;

public class CharacterDND {
    private int age;
    private int level;
    private Class classType;
    private Race raceType;
    private int maxHitPoints;
    private int currentHitPoints;
    private ArrayList<String> inventory;
    public CharacterDND(Class classType, Race raceType){
        this.classType=classType;
        this.raceType = raceType;
        currentHitPoints = maxHitPoints;
    }
    public void assignRaceAbilityScore(){

    }
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Race race1 = Race.DRAGONBORN;
        CharacterDND character = new CharacterDND(Class.BARBARIAN,Race.DRAGONBORN);

    }

}
