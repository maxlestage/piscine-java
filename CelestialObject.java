public class CelestialObject {

    // x (double)
    // y (double)
    // z (double)
    // name (String)

    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String name_value, double x_value, double y_value, double z_value) {
        x = x_value;
        y = y_value;
        z = z_value;
        name = name_value;
    }
}
