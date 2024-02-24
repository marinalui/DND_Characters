import java.util.ArrayList;
import java.util.Random;

public class CharacterDND {
    private int age;
    private int level;
    private Class classType;
    private Race raceType;
    private int maxHitPoints;
    private int currentHitPoints;
    private ArrayList<String> inventory;
    Random rand = new Random();
    public CharacterDND(Class classType, Race raceType){
        this.classType=classType;
        this.raceType = raceType;
        currentHitPoints = maxHitPoints;
    }
    public void assignRaceAbilityScore(){
        switch(raceType){
            case DRAGONBORN:
                age = rand.nextInt(81);
                break;
            case DWARF:
                age = rand.nextInt(351);
                break;
            case ELF:
                age = rand.nextInt(751);
                break;
            case GNOME:
                age = rand.nextInt(501);
                break;
            case HALFELF:
                age = rand.nextInt(181);
                break;
            case HALFLING:
                age = rand.nextInt(251);
                break;
            case HALFORC:
                age = rand.nextInt(76);
                break;
            case HUMAN:
                age = rand.nextInt(100);
                break;
            case TIEFLING:
                age = rand.nextInt(106);
                break;
        }
    }
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Race race1 = Race.DRAGONBORN;
        CharacterDND character = new CharacterDND(Class.BARBARIAN,Race.DRAGONBORN);

    }



}
