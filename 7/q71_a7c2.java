public class q71_a7c2 {
    public static void main(String[] args) {
        Warrior warriorOne = new Warrior("Conan", 100, 150, 15, "Two-Handed Sword");
        System.out.println("--------1--------");
        warriorOne.calculateDamage();
        System.out.println(warriorOne);
        System.out.println("--------2--------");
        Mage mageOne = new Mage("Merlin", 80, 200, 18, "Arcane Staff");
        mageOne.calculateDamage();
        System.out.println(mageOne);
        System.out.println("--------3--------");
        GameCharacter.printAllCharacters();
    }
}

class GameCharacter {
    public static String [] allCharacters= new String [5];
    public static int characterCount=0;
    private String characterName;
    private int level;
    public String weaponType;
    public double totalDamage;
    public GameCharacter(String name, int level, String weapon) {
        this.characterName = name;
        this.level = level;
        this.weaponType= weapon;
    }
    public String getCharacterInfo() {
        return "Name: " + characterName + ", Level: " + level;
    }
    public int getLevel(){
        return level;
    }
    public static void printAllCharacters(){
        if (characterCount>0) {
            System.out.println("Available Characters:");
            for(int i=0;i<characterCount;i++){
                System.out.println(allCharacters[i]);
            }
        }
        else {
            System.out.println("No available character");
        }
    }
}



/*

Damage Calculation Formulas:
Warrior: (level * strength) + (armor * 50)
Mage: (level * intelligence) + (mana * 10)


A new warrior has arrived
--------1--------
Name: Conan, Level: 100
Character Type: Warrior
Weapon: Two-Handed Sword
Strength: 150, Armor: 15
Total Damage: 15750.0
--------2--------
A new mage came to live
Name: Merlin, Level: 80
Character Type: Mage
Weapon: Arcane Staff
Intelligence: 200, Mana: 18
Total Damage: 16180.0
--------3--------
Available Characters:
Conan
Merlin

 */