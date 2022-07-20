public class Character {
    /*
     * Instructions
     * 
     * In the following quest, we will work with the same files and classes. You
     * should keep them from one exercise to the following.
     * 
     * Create a file Character.java.
     * 
     * Create a public class named Character.
     * The class must contains three properties :
     * 
     * maxHealth (int) : with a getter and no setter. This property is not updatable
     * (final keyword).
     * currentHealth (int) : with a getter and no setter.
     * name (String) : with a getter and no setter. This property is not updatable
     * (final keyword).
     * 
     * Create a constructor with two parameters (name and maxHealth) : the
     * currentHealth is initialized with the maxHealth value.
     * 
     * 
     * 
     * 
     */
    final int maxHealth;
    private int currentHealth;
    final String name;

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
    }

    /*
     * Rewrite the toString,
     * that will
     * have the format<name>:*<currentHealth>/<maxHealth>.
     * If the
     * currentHealth is 0,
     * the format is<name>:KO.
     */

    @Override
    public String toString() {
        if (currentHealth > 0) {
            return name + " : " + currentHealth + "/" + maxHealth;
        } else {
            return name + " : KO";
        }
    }

    /*
     * Implement two methods :
     * 
     * takeDamage, with an integer parameter, that will remove the amount in
     * parameter to the currentHealth. The current health can't be lower than 0.
     * attack, with a Character parameter, that will call takeDamage of the
     * parameter with a default value : 9.
     */

    public void takeDamage(int dammagedValue) {
        this.currentHealth = currentHealth - dammagedValue;
    }

    public void attack(Character personnage) {
        personnage.takeDamage(9);
    }

}
