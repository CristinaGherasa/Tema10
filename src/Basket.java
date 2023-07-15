import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {
    private List<String> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new ArrayList<>(fruits);
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int uniqueFruitsCount() {
        int count = 0;
        for(int i = 0; i < fruits.size(); i++) {
            boolean isUnique = true;
            for(int j = i + 1; j < fruits.size(); j++) {
                if(fruits.get(i).equals(fruits.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                count++;
            }
        }
        return count;
    }


}
