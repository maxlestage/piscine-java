public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;

    public static double KM_IN_ONE_AU = 150_000_000;

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
        // double rounded_result = Math.round(square_result * 1000.0) / 1000.0;
        double rounded_result = Math.ceil(square_result);
        // double rounded_result = square_result;

        // System.out.println("getDistanceBetween");
        // System.out.println("earth");
        // System.out.println(earth.getX() + " ; " + earth.getY() + " ; " +
        // earth.getZ());
        // System.out.println();
        // System.out.println("defaultStar");
        // System.out.println(defaultStar.getX() + " ; " + defaultStar.getY() + " ; " +
        // defaultStar.getZ());
        // System.out.println();
        // System.out.println(rounded_result);

        return rounded_result;

    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar,
            CelestialObject earth) {

        // double result = getDistanceBetween(defaultStar, earth) * KM_IN_ONE_AU;
        // System.out.println("getDistanceBetweenInKm");
        // System.out.println(result);
        // return result;

        double x_distance = earth.getX() - defaultStar.getX();
        double y_distance = earth.getY() - defaultStar.getY();
        double z_distance = earth.getZ() - defaultStar.getZ();
        double calc = (x_distance * x_distance) + (y_distance * y_distance) + (z_distance * z_distance);
        double square_result = Math.sqrt(calc);
        // double rounded_result = Math.round(square_result * 1000.0) / 1000.0;
        double rounded_result = Math.ceil(square_result) * KM_IN_ONE_AU;
        // double rounded_result = square_result;
        System.out.println("getDistanceBetweenInKm");
        System.out.println("Math.ceil(square_result)");
        System.out.println(Math.ceil(square_result));
        System.out.println("square_result");
        System.out.println(square_result);
        System.out.println("square_result * KM_IN_ONE_AU");
        System.out.println(square_result * KM_IN_ONE_AU);
        System.out.println("rounded_result");
        System.out.println(rounded_result);
        return rounded_result;

    }

}
