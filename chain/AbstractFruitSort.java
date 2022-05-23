package chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
    private int weight;
    protected List<String> fruitBOX;
    private AbstractFruitSort nextFruitSort;
    public void getFruitBox()
    {
        System.out.println("Weight:" + weight);
        System.out.println("个数：" + fruitBOX.size());
        for(String t:fruitBOX)
        {
            System.out.print(t+",");
        }
        System.out.println(" ");
    }
    public AbstractFruitSort(int weight)
    {
        this.weight = weight;
        fruitBOX = new ArrayList<String>();
    }
    public void setNextFruitSort(AbstractFruitSort nextFruitSort){
        this.nextFruitSort = nextFruitSort;
    }
    public void sendFruit(int weight, String fruit)
    {
        if(this.weight==weight)
            pushBox(fruit);
        else
            if(nextFruitSort!=null)
                nextFruitSort.sendFruit(weight, fruit);
    }
    abstract protected void pushBox(String fruit);


}
