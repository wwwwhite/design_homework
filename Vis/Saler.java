package Vis;

public class Saler extends AVisitor{
    public void visit(Apple apple)
    {
        System.out.println("收银员" + name + "给苹果过秤");
    }
    public void visit(Book book)
    {
        System.out.println("收银员" + name + "计算书钱");
    }
}
