import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

public class Planet extends CelestialObject {

    private Star centerStar;

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Planet)) {
            return false;
        }
        Planet planet = (Planet) o;
        return Objects.equals(centerStar, planet.centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(centerStar);
    }

    /*
     * Finally, we rewrite the toString method. The returned String must have the
     * following format : <name> circles around <centerStar.name> at the
     * <distanceWithCenterStar> AU. The distanceWithCenterStar is computed using the
     * distanceBetween method with the planet and its center star.
     */

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
        String distanceWithCenterStar = String.valueOf(df.format(getDistanceBetween(this.centerStar, this)));
        String result = getName() + " circles around " + centerStar.name + " at the "
                + distanceWithCenterStar + " AU";
        return result;
    }

}
