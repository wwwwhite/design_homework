package Meb;

public class DiamondMember extends Member{
    public DiamondMember(String name)
    {
        super(name);
    }
    public void sendText(String to, String message)
    {
        System.out.println("钻石会员发送消息");
        chatroom.sendText(name, to, message);
    }
}
