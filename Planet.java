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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Planet planet = (Planet) o;
        return centerStar.equals(planet.centerStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
        String distanceWithCenterStar = String.valueOf(df.format(getDistanceBetween(this.centerStar, this)));
        String result = getName() + " circles around " + centerStar.name + " at the "
                + distanceWithCenterStar + " AU";
        return result;
    }

}
