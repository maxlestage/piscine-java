public interface Healer {
    /*
     * heal which takes a character as parameter and return nothing.
     * 
     * getHealCapacity which returns an integer.
     */

    public void heal(Character character);

    public int getHealCapacity();
}