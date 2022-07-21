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

        if (allCharacters.isEmpty()) {
            return ("------------------------------------------\nNobody's fighting right now !\n------------------------------------------");
        }

        String buffer = (" - " + allCharacters.get(0).toString() + "\n");

        for (int i = 1; i < allCharacters.size(); i++) {

            buffer = buffer
                    + (" - " + (allCharacters.get(i).toString() + "\n"));

        }

        return ("------------------------------------------\nCharacters currently fighting :\n" + buffer
                + "------------------------------------------");
    }

    public static Character fight(Character personnage1, Character personnage2) {
        while (personnage1.getCurrentHealth() > 0 && personnage2.getCurrentHealth() > 0) {
            personnage1.attack(personnage2);
            if (personnage2.getCurrentHealth() > 0) {
                personnage2.attack(personnage1);
            }
        }

        if (personnage1.getCurrentHealth() == 0) {
            return personnage2;
        }

        if (personnage2.getCurrentHealth() == 0) {
            return personnage1;
        }

        return null;

    }
}
