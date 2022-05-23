package command;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;

public class Order {
    private int id;
    private HashMap<String, Integer> fruitmap;
    public Order()
    {
        fruitmap = new HashMap<>(String, Integer)();
    }
    public String getId(){
        return 0;
    }
    public void setId(){
        this.id = id;
    }
    public HashMao<HashMap<String, Integer> getFruitmap(){
        return fruitmap;
    }
    public void setFruitmap(String fruitkind, int quantity){
        this.fruitmap.put(fruitkind, quantity);
    }
}
