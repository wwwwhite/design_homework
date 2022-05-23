package Bui;

import com.sun.javaws.jnl.XMLUtils;

public class Client {
    public static void main(String args[])
    {
        MealBuider mb = (MealBuider) XMLUtil.GETBean();
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal = waiter.construct();

        System.out.println("套餐组成:");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
