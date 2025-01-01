import java.util.Comparator;

public class OrderTotalPriceComparator implements Comparator<Order> {
    public int compare(Order o1, Order o2) {
        if(o1.getTotalPrice() > o2.getTotalPrice()){
            return 1;
        }
        return -1;
    }

}
