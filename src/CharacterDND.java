import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class CharacterDND {
    private int age;
    private int height;
    private int weight;

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
                break;
            case DWARF:
                age = rand.nextInt(351);
                // Hill Dwarf stats
                height = rand.nextInt(46, 52);
                weight = rand.nextInt(119, 211);
                break;
            case ELF:
                age = rand.nextInt(751);
                // High elf stats
                height = rand.nextInt(56, 74);
                weight = rand.nextInt(92, 170);
                break;
            case GNOME:
                age = rand.nextInt(501);
                height = rand.nextInt(37, 43);
                weight = rand.nextInt(37, 43);
                break;
            case HALFELF:
                age = rand.nextInt(181);
                height = rand.nextInt(59, 73);
                weight = rand.nextInt(114, 238);
                break;
            case HALFLING:
                age = rand.nextInt(251);
                height = rand.nextInt(33, 39);
                weight = rand.nextInt(37, 43);
                break;
            case HALFORC:
                age = rand.nextInt(76);
                height = rand.nextInt(60, 78);
                weight = rand.nextInt(144, 380);
                break;
            case HUMAN:
                age = rand.nextInt(100);
                height = rand.nextInt(58, 76);
                weight = rand.nextInt(114, 270);
                break;
            case TIEFLING:
                age = rand.nextInt(106);
                height = rand.nextInt(59, 73);
                weight = rand.nextInt(114, 238);
                break;
        }

    }
    public void readUserInput(String input){
        if(input.contains("Dragonborn")){
            this.raceType = Race.DRAGONBORN;
        } else if (input.contains("Dwarf")){
            this.raceType = Race.DWARF;
        }else if(input.contains("Elf")){
            this.raceType = Race.ELF;
        }else if(input.contains("Gnome")){
            this.raceType = Race.GNOME;
        }else if(input.contains("Half-elf")){
            this.raceType = Race.HALFELF;
        }else if(input.contains("Halfling")){
            this.raceType = Race.HALFLING;
        } else if(input.contains("Half-orc")){
            this.raceType = Race.HALFORC;
        } else if(input.contains("Human")){
            this.raceType = Race.HUMAN;
        } else if(input.contains("Tiefling")){
            this.raceType = Race.TIEFLING;
        } else{
            System.out.println("A valid Race was not found.");
        }
    }
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter race:");
        String userInput = myObj.nextLine();  // Read user input
        CharacterDND character = new CharacterDND(null, null);
        character.readUserInput(userInput);
        character = new CharacterDND(Class.BARBARIAN, character.raceType);
        System.out.println("Character:"+ character.raceType+", "+character.classType);
    }

}
