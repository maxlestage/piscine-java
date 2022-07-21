public interface Tank {

    default int getShield(int shieldPower) {
        return shieldPower;
    }

}
