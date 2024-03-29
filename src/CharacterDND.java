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
                assignAbilityScore(Ability.STRENGTH, Ability.CONSTITUTION, Ability.DEXTERITY, Ability.WISDOM, Ability.CHARISMA, Ability.INTELLIGENCE);
                maxHitPoints = 12;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(12);
                }
                break;
            case BARD:
                assignAbilityScore(Ability.CHARISMA, Ability.DEXTERITY, Ability.WISDOM, Ability.INTELLIGENCE, Ability.CONSTITUTION, Ability.STRENGTH);
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(8);
                }
                break;
            case CLERIC:
                assignAbilityScore(Ability.WISDOM, Ability.CONSTITUTION, Ability.STRENGTH, Ability.INTELLIGENCE, Ability.CHARISMA, Ability.DEXTERITY);
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(8);
                }
                break;
            case DRUID:
                assignAbilityScore(Ability.WISDOM, Ability.CONSTITUTION, Ability.INTELLIGENCE, Ability.DEXTERITY, Ability.STRENGTH, Ability.CHARISMA);
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(8);
                }
                break;
            case FIGHTER:
                assignAbilityScore(Ability.STRENGTH, Ability.DEXTERITY, Ability.CONSTITUTION, Ability.WISDOM, Ability.CHARISMA, Ability.INTELLIGENCE);
                maxHitPoints = 10;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(10);
                }
                break;
            case MONK:
                assignAbilityScore(Ability.DEXTERITY, Ability.WISDOM, Ability.CONSTITUTION, Ability.STRENGTH, Ability.INTELLIGENCE, Ability.CHARISMA);
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(8);
                }
                break;
            case PALADIN:
                assignAbilityScore(Ability.STRENGTH, Ability.CHARISMA, Ability.CONSTITUTION, Ability.WISDOM, Ability.INTELLIGENCE, Ability.DEXTERITY);
                maxHitPoints = 10;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(10);
                }
                break;
            case RANGER:
                assignAbilityScore(Ability.DEXTERITY, Ability.WISDOM, Ability.INTELLIGENCE, Ability.CONSTITUTION, Ability.STRENGTH, Ability.CHARISMA);
                maxHitPoints = 10;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(10);
                }
                break;
            case ROGUE:
                assignAbilityScore(Ability.DEXTERITY, Ability.CHARISMA, Ability.INTELLIGENCE, Ability.CONSTITUTION, Ability.WISDOM, Ability.STRENGTH);
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(8);
                }
                break;
            case SORCERER:
                assignAbilityScore(Ability.CHARISMA, Ability.CONSTITUTION, Ability.INTELLIGENCE, Ability.WISDOM, Ability.DEXTERITY, Ability.STRENGTH);
                maxHitPoints = 6;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(6);
                }
                break;
            case WARLOCK:
                assignAbilityScore(Ability.CHARISMA, Ability.CONSTITUTION, Ability.INTELLIGENCE, Ability.WISDOM, Ability.STRENGTH, Ability.DEXTERITY);
                maxHitPoints = 8;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(8);
                }
                break;
            case WIZARD:
                assignAbilityScore(Ability.INTELLIGENCE, Ability.CONSTITUTION, Ability.DEXTERITY, Ability.WISDOM, Ability.CHARISMA, Ability.STRENGTH);
                maxHitPoints = 6;
                for(int i = 0; i < level; i++){
                    maxHitPoints += 1 + rand.nextInt(6);
                }
                break;
        }
    }

    public void assignAbilityScore(Ability ability1, Ability ability2, Ability ability3, Ability ability4, Ability ability5, Ability ability6){
        int score1 = rollForStat();
        int score2 = rollForStat();
        int score3 = rollForStat();
        int score4 = rollForStat();
        int score5 = rollForStat();
        int score6 = rollForStat();
        int[] sortedAbilities = {score1, score2, score3, score4, score5, score6};
        for (int i = 0; i < sortedAbilities.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < sortedAbilities.length; j++) {

                // Checking elements
                int temp = 0;
                if (sortedAbilities[j] < sortedAbilities[i]) {

                    // Swapping
                    temp = sortedAbilities[i];
                    sortedAbilities[i] = sortedAbilities[j];
                    sortedAbilities[j] = temp;
                }
            }
        }
        abilityScores.put(ability1,sortedAbilities[5]);
        abilityScores.put(ability2, sortedAbilities[4]);
        abilityScores.put(ability3, sortedAbilities[3]);
        abilityScores.put(ability4, sortedAbilities[2]);
        abilityScores.put(ability5, sortedAbilities[1]);
        abilityScores.put(ability6, sortedAbilities[0]);

    }
    public int rollForStat(){
        int num1 = 1 + rand.nextInt(6);
        int num2 = 1 + rand.nextInt(6);
        int num3 = 1 + rand.nextInt(6);
        int num4 = 1 + rand.nextInt(6);
        int result = num1;
        if(num2 < result){
            result = num2;
        }
        if(num3 < result){
            result = num3;
        }
        if(num4 < result){
            result = num4;
        }
        return num1 + num2 + num3 + num4 - result;

    }

    /**
     * we should call these in the assignRaceFeatures
     * @param strength the added bonus
     * @param dexterity the added bonus
     * @param constitution the added bonus
     * @param intelligence the added bonus
     * @param wisdom the added bonus
     * @param charisma the added bonus
     */
    public void raceStatUpdate(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        abilityScores.put(Ability.STRENGTH, abilityScores.get(Ability.STRENGTH) + strength);
        abilityScores.put(Ability.DEXTERITY, abilityScores.get(Ability.DEXTERITY) + dexterity);
        abilityScores.put(Ability.CONSTITUTION, abilityScores.get(Ability.CONSTITUTION) + constitution);
        abilityScores.put(Ability.INTELLIGENCE, abilityScores.get(Ability.INTELLIGENCE) + intelligence);
        abilityScores.put(Ability.WISDOM, abilityScores.get(Ability.WISDOM) + wisdom);
        abilityScores.put(Ability.CHARISMA, abilityScores.get(Ability.CHARISMA) + charisma);
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
        System.out.println("Height: " + character.height + "\"");
        System.out.println("Weight: " + character.weight + "lbs");
        System.out.println("Speed: " + character.speed);
        System.out.println("Max HP: " + character.maxHitPoints);
        System.out.println("Age: "+ character.age);
        System.out.println("Ability scores:" +character.abilityScores);
    }
}
