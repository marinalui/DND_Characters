import java.util.ArrayList;
import java.util.Scanner;

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
