package Obv;

import Obv.ObserverO;

public class Concreteobserver2 implements ObserverO{
    @Override
    public void response(){
        System.out.println("目标变化了，2的反应");
    }
}
