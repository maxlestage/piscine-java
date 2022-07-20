import java.util.ArrayList;
import java.util.List;

public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;

    private static List<Character> allCharacters = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    @Override
    public String toString() {
        if (currentHealth > 0) {
            return name + " : " + currentHealth + "/" + maxHealth;
        } else {
            return name + " : KO";
        }
    }

    public void takeDamage(int dammagedValue) {
        this.currentHealth = currentHealth - dammagedValue;
    }

    public void attack(Character personnage) {
        personnage.takeDamage(9);
        if (personnage.currentHealth <= 0) {
            personnage.currentHealth = 0;
        }
    }

    public static String printStatus() {
        for (Character character : allCharacters) {
            return character.toString();
        }
    }

    public static Character fight(Character personnage1, Character personnage2) {
        return null;
    }

}
