import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FlowerBouquet {
    private Set<String> flowers;

    public FlowerBouquet() {
        flowers = new HashSet<>();
    }

    public Collection<String> getAll() {
        return flowers;
    }

    public void add(String flower) {
        flowers.add(flower);
    }

    public boolean remove(String flower) {
        return flowers.remove(flower);
    }
}
