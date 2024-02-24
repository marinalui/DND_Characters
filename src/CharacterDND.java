import java.util.ArrayList;
import java.util.Random;

public class CharacterDND {
    private int age;
    private int height;
    private int weight;
    private int speed;

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
                height = rand.nextInt(68, 82);
                weight = rand.nextInt(179, 367);
                speed = 30;
                break;
            case DWARF:
                age = rand.nextInt(351);
                // Hill Dwarf stats
                height = rand.nextInt(46, 52);
                weight = rand.nextInt(119, 211);
                speed = 25;
                break;
            case ELF:
                age = rand.nextInt(751);
                // High elf stats
                height = rand.nextInt(56, 74);
                weight = rand.nextInt(92, 170);
                speed = 30;
                break;
            case GNOME:
                age = rand.nextInt(501);
                height = rand.nextInt(37, 43);
                weight = rand.nextInt(37, 43);
                speed = 25;
                break;
            case HALFELF:
                age = rand.nextInt(181);
                height = rand.nextInt(59, 73);
                weight = rand.nextInt(114, 238);
                speed = 30;
                break;
            case HALFLING:
                age = rand.nextInt(251);
                height = rand.nextInt(33, 39);
                weight = rand.nextInt(37, 43);
                speed = 25;
                break;
            case HALFORC:
                age = rand.nextInt(76);
                height = rand.nextInt(60, 78);
                weight = rand.nextInt(144, 380);
                speed = 30;
                break;
            case HUMAN:
                age = rand.nextInt(100);
                height = rand.nextInt(58, 76);
                weight = rand.nextInt(114, 270);
                speed = 30;
                break;
            case TIEFLING:
                age = rand.nextInt(106);
                height = rand.nextInt(59, 73);
                weight = rand.nextInt(114, 238);
                speed = 30;
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
