import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderProcess implements Comparator<Order> {

    private PriorityQueue<Order> priorityQueue ;

    public OrderProcess(PriorityQueue<Order> priorityQueue) {
        this.priorityQueue = new PriorityQueue<>();
    }

    public PriorityQueue<Order> getPriorityQueue() {
        return priorityQueue;
    }
    public void setComparatorOrderProcess(Comparator<Order> c){
        this.priorityQueue = new PriorityQueue<>(c);
    }


    public void addOrder(Order order){
        priorityQueue.add(order);
    }

    public Order processOrder(){
        return priorityQueue.poll();
    }


    public void setPriorityQueue(PriorityQueue<Order> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.isExpress() == o2.isExpress()){
            return 0;
        }else if(o1.isExpress()){
            return 1;
        }else if(o2.isExpress()) {
            return 1;
        }

        return 0;
    }

}
