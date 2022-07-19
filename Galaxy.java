import java.util.ArrayList;
import java.util.List;

public class Galaxy extends CelestialObject {

    private List<CelestialObject> CelestialObject;

    public Galaxy() {
        this.CelestialObject = new ArrayList<>();
    }

    public void setCelestialObject(List<CelestialObject> CelestialObject) {
        this.CelestialObject = CelestialObject;
    }

    public void addCelestialObject(CelestialObject celestialObjet) {
        CelestialObject.add(celestialObjet);
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.CelestialObject;
    }

}
