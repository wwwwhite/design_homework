package chain;

public class MidFruitSorting extends AbstractFruitSort{
    public MidFruitSorting(int weight){
        super(weight);
    }

    @Override
    protected void pushBox(String fruit){
        fruit.add("水果罐头" + fruit);
    }
}
