import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;

    public static double KM_IN_ONE_AU = 150_000_000;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name_value, double x_value, double y_value, double z_value) {
        x = x_value;
        y = y_value;
        z = z_value;
        name = name_value;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject defaultStar, CelestialObject earth) {

        double x_distance = earth.getX() - defaultStar.getX();
        double y_distance = earth.getY() - defaultStar.getY();
        double z_distance = earth.getZ() - defaultStar.getZ();
        double calc = (x_distance * x_distance) + (y_distance * y_distance) + (z_distance * z_distance);
        double square_result = Math.sqrt(calc);
        double rounded_result = square_result;
        return rounded_result;

    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar,
            CelestialObject earth) {
        double result = getDistanceBetween(defaultStar, earth) * KM_IN_ONE_AU;
        return result;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000", new DecimalFormatSymbols(Locale.ENGLISH));
        String x = String.valueOf(df.format(this.getX()));
        String y = String.valueOf(df.format(this.getY()));
        String z = String.valueOf(df.format(this.getZ()));

        String result = this.getName() + " is positioned at "
                + "(" + x + ", " + y + ", " +
                z + ")";

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CelestialObject that = (CelestialObject) o;
        return Double.compare(that.x, this.x) == 0 && Double.compare(that.y,
                this.y) == 0 && Double.compare(that.z, this.z) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }

}
