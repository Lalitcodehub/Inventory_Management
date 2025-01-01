import java.util.Comparator;
import java.util.Map;

public class ItemQuantityComparator<T extends Item> implements Comparator<Map.Entry<String , T>> {


    @Override
    public int compare(Map.Entry<String, T> o1, Map.Entry<String, T> o2) {
        T item1 = o1.getValue();
        T item2 = o2.getValue();
        return  Integer.compare(item1.getQuantity() , item2.getQuantity());
    }
}
