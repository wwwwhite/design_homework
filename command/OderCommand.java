package command;

public class OderCommand implements Command{
    private Operator receiver;
    private Order order;
    public OderCommand(Operator receiver, Order order)
    {
        this.receiver = receiver;
        this.order = order;
    }
    @Override
    public void execute(){
        System.out.println(order.getId() + "号顾客点的成品");
        receiver.MarkFruit(order);
    }
}
