import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

public class Star extends CelestialObject {

    private double magnitude;

    public double x;
    public double y;
    public double z;
    public String name;

    /**
     * @return double return the magnitude
     */
    public double getMagnitude() {
        return magnitude;
    }

    /**
     * @param magnitude the magnitude to set
     */
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star() {
        super();
    }

    public Star(String name_value, double x_value, double y_value, double z_value, double magnitude_value) {
        super(name_value, x_value, y_value, z_value);
        this.magnitude = magnitude_value;
        System.out.println(name_value + " " + x_value + " " + y_value + " " + z_value + " " + magnitude_value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Star)) {
            return false;
        }
        Star star = (Star) o;
        return magnitude == star.magnitude && x == star.x && y == star.y && z == star.z
                && Objects.equals(name, star.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, x, y, z, name);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000", new DecimalFormatSymbols(Locale.ENGLISH));
        String magnitude = String.valueOf(df.format(this.magnitude));
        String result = super.getName() + " shines at the " + magnitude + " magnitude";
        return result;
    }

}
