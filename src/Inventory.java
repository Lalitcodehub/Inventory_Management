import java.util.*;

public class Inventory<T extends Item> {
    private LinkedHashMap<String, T>  map;
    static final int size  = 3 ;
    public Inventory() {
        map = new LinkedHashMap<String, T>();

    }
    public void SortByQuantityComparator(){

          List<Map.Entry<String ,  T >> list = new ArrayList<>(map.entrySet());
          list.sort(new ItemQuantityComparator<>());


    }

    public List<T> filterByPriceRange(double from , double to){

        List<T>  list  = new ArrayList<>();

         for(Map.Entry<String , T> entry : map.entrySet()){

             if(entry.getValue().getPrice() >= from && entry.getValue().getPrice() <= to && entry.getValue().getQuantity() > 0){
                 list.add(entry.getValue());
             }

         }

       return list;
    }

   public void  addItem(T item){
        map.put(item.getId(), item);
    }
    public void removeItem(String id){
                if(map.containsKey(id)){

                    map.remove(id);
                }
    }

    List<T> getAllItems(){
        List<T> list = new ArrayList<T>();
        for(String key : map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }



}
