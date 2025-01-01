import java.util.PriorityQueue;

public class Order implements Comparable<Order>{
   private  String orderId ;
    private boolean isExpress ;
    private double TotalPrice ;

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }


    public void setExpress(boolean express) {
        isExpress = express;
    }

    public Order(String orderId, boolean isExpress, double totalPrice) {
        this.orderId = orderId;
        this.isExpress = isExpress;
        TotalPrice = totalPrice;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress ){
            return this.orderId.compareTo(o.orderId);
        }else if(this.isExpress){
            return -1;
        }else {
            return 1;
        }
    }
}
