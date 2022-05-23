package Bui;

public class KFCWaiter {
    private MealBuider mb;
    public void setMealBuilder(MealBuider mb)
    {
        this.mb = mb;
    }
    public Meal construct()
    {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
