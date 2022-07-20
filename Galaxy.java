import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Integer> computeMassRepartition() {

        Map<String, Integer> data = new HashMap<String, Integer>();

        Integer massPropertyStar = 0;
        Integer massPropertyPlanet = 0;
        Integer massPropertyOther = 0;

        // Star, Planet or Other
        for (CelestialObject objet : this.celestialObjects) {
            if (objet.getClass() == Star.class) {
                massPropertyStar = massPropertyStar + objet.getMassProperty();
                data.put("Star", massPropertyStar);
            } else if (objet.getClass() == Planet.class) {
                massPropertyPlanet = massPropertyPlanet + objet.getMassProperty();
                data.put("Planet", massPropertyPlanet);
            } else {
                massPropertyOther = massPropertyOther + objet.getMassProperty();
                data.put("Other", massPropertyOther);
            }
        }
        return data;

    }
}
