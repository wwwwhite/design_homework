package Str;

public class FruitKnife implements ICutFruit{
    @Override
    public void CutStrategy(String fruitname)
    {
        System.out.println(fruitname + "一次被切一片");
    }
}
