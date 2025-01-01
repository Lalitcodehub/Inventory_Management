import java.util.LinkedList;

public class RecentlyViewedItem {
   private LinkedList<Item> ll ;

    public LinkedList<Item> getLl() {
        return ll;
    }

    public void setLl(LinkedList<Item> ll) {
        this.ll = ll;
    }

    public RecentlyViewedItem(LinkedList<Item> ll) {
        this.ll = ll;
    }
    void addRecentlyViewedItem(Item item) {
        ll.remove(item);
        ll.addFirst(item);
        if(ll.size() > 3){
            ll.removeLast();
        }
    }
}
