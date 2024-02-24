import java.util.*;

public class CharacterDND {
    private int age;
    private int height;
    private int weight;
    private int speed;

    private int level;
    private Class classType;
    private Race raceType;
    private int maxHitPoints;
    private ArrayList<String> inventory;
    private Map<Ability, Integer> abilityScores = new HashMap<>();
    Random rand = new Random();
    public CharacterDND(Class classType, Race raceType){
        this.classType=classType;
        this.raceType = raceType;
    }
    public void assignRaceFeatures(){
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
    public void assignClassFeatures(){
        switch (classType){
            case BARBARIAN:
                maxHitPoints = 12;
                for(int i = 0; i < level; i++){
                    maxHitPoints += rand.nextInt(1,12);
                }
                break;
            case BARD:
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += rand.nextInt(1,8);
                }
                break;
            case CLERIC:
                break;
            case DRUID:
                break;
            case FIGHTER:
                break;
            case MONK:
                break;
            case PALADIN:
                break;
            case RANGER:
                break;
            case ROGUE:
                break;
            case SORCERER:
                break;
            case WARLOCK:
                break;
            case WIZARD:
                break;
        }
    }
    public void readUserInput(String raceInput, String classInput ){
        //checking race
        if(raceInput.equalsIgnoreCase("Dragonborn")){
            this.raceType = Race.DRAGONBORN;
        } else if (raceInput.equalsIgnoreCase("Dwarf")){
            this.raceType = Race.DWARF;
        }else if(raceInput.equalsIgnoreCase("Elf")){
            this.raceType = Race.ELF;
        }else if(raceInput.equalsIgnoreCase("Gnome")){
            this.raceType = Race.GNOME;
        }else if(raceInput.equalsIgnoreCase("Half-elf")){
            this.raceType = Race.HALFELF;
        }else if(raceInput.equalsIgnoreCase("Halfling")){
            this.raceType = Race.HALFLING;
        } else if(raceInput.equalsIgnoreCase("Half-orc")){
            this.raceType = Race.HALFORC;
        } else if(raceInput.equalsIgnoreCase("Human")){
            this.raceType = Race.HUMAN;
        } else if(raceInput.equalsIgnoreCase("Tiefling")){
            this.raceType = Race.TIEFLING;
        }
        //checking Class input
        if(classInput.equalsIgnoreCase("Barbarian")){
            this.classType= Class.BARBARIAN;
        }else if(classInput.equalsIgnoreCase("Bard")){
            this.classType = Class.BARD;
        } else if(classInput.equalsIgnoreCase("Cleric")){
            this.classType = Class.CLERIC;
        }else if(classInput.equalsIgnoreCase("Druid")){
            this.classType = Class.DRUID;
        }else if(classInput.equalsIgnoreCase("Fighter")){
            this.classType = Class.FIGHTER;
        }else if(classInput.equalsIgnoreCase("Monk")){
            this.classType = Class.MONK;
        }else if(classInput.equalsIgnoreCase("Paladin")){
            this.classType = Class.PALADIN;
        }else if(classInput.equalsIgnoreCase("Ranger")){
            this.classType = Class.RANGER;
        }else if(classInput.equalsIgnoreCase("Rogue")){
            this.classType = Class.ROGUE;
        }else if(classInput.equalsIgnoreCase("Sorcerer")){
            this.classType = Class.SORCERER;
        }else if(classInput.equalsIgnoreCase("Warlock")){
            this.classType = Class.WARLOCK;
        }else if(classInput.equalsIgnoreCase("Wizard")){
            this.classType = Class.WIZARD;
        }
        if(raceType == null || classType == null){
            System.out.println("A valid Race or Class was not found.");
        }
    }
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Race:");
        String raceInput = myObj.nextLine();  // Read user input
        System.out.println("Enter Class:");
        String classInput = myObj.nextLine();
        CharacterDND character = new CharacterDND(null, null);
        character.readUserInput(raceInput,classInput);
        character = new CharacterDND(character.classType, character.raceType);
        character.assignRaceFeatures();
        character.assignClassFeatures();
        System.out.println("Character:"+ character.raceType+", "+character.classType);
    }

}
