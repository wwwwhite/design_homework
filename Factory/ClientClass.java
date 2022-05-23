package Factory;

import pro.Apple;
import pro.MyFruit;

public class ClientClass {

    public static void main(String[] args){
        MyFruit fru1 = new Apple();
        MyFruit fru2 = fru1;
        fru1.Display();
        fru2.Display();
    }
    public String factory(String fruitname)
    {
        if(fruitname.equals("Apple"))
            return "Apple";
        if(fruitname.equals("Banana"))
            return "Banana";
        return null;
    }
}
