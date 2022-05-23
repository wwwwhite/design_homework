package Obv;

public class ConcreteSubjectB {
    public ConcreteSubjectB()
    {
        super();
    }
    @Override
    public void notifyObserver(){
        System.out.println("B目标发生改变了");
        for(ObserverO obs:observers)
        {
            obs.response();
        }
    }
}
