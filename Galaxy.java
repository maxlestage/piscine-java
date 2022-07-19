import java.util.ArrayList;
import java.util.List;

public class Galaxy extends CelestialObject {

    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    public void setCelestialObject(List<CelestialObject> CelestialObject) {
        this.celestialObjects = CelestialObject;
    }

    public void addCelestialObject(CelestialObject celestialObjet) {
        celestialObjects.add(celestialObjet);
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

}
