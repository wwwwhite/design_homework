package Ite;

public class TCLTelevision implements Television{
    private Object[] obj={"湖南卫视", "北京卫视","安徽卫视"};
    public TVIterator createIterator()
    {
        return new TCLTelevision();
    }
    class TCLIterator implements TVIterator()
    {
        private int currentIndex = 0;
    }

}
