package chain;

public class BigFruitSorting extends AbstractFruitSort{
    public BigFruitSorting(int weight){
        super(weight);
    }
    @Override
    protected void pushBox(String fruit){
        fruitBOX.add("超市" + fruit);
    }
}
