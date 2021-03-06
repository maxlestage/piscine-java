import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {

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

        Map<String, Integer> data = new HashMap<>();

        int massStar = 0;
        int massPlanet = 0;
        int massOther = 0;

        data.put("Planet", massPlanet);
        data.put("Star", massStar);
        data.put("Other", massOther);

        // Star, Planet or Other
        for (CelestialObject objet : this.celestialObjects) {
            if (objet.getClass() == Star.class) {
                massStar = massStar + objet.getMass();
                data.put("Star", massStar);
            } else if (objet.getClass() == Planet.class) {
                massPlanet = massPlanet + objet.getMass();
                data.put("Planet", massPlanet);
            } else {
                massOther = massOther + objet.getMass();
                data.put("Other", massOther);
            }
        }
        return data;
    }
}
