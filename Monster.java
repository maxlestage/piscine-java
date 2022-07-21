public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";

        } else {
            return (this.getName() + " is a monster and is dead");
        }

    }

}
