public interface Healer {
    /*
     * heal which takes a character as parameter and return nothing.
     * 
     * getHealCapacity which returns an integer.
     */

    default void heal(Character character) {

    }

    default int getHealCapacity(int healCapacityLevel) {
        return healCapacityLevel;
    }

}
