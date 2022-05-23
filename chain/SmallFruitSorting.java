package chain;

public class SmallFruitSorting {
    public SmallFruitSorting(int weight){
        super(weight);
    }

    @Override
    protected void pushBox(String fruit){
        fruit.add("打果汁" + fruit);
    }
}
