package Factory;

public class Bfactory extends Factory{
    public Fruit CreateFruit(){
        return new Banana();
    }

}
