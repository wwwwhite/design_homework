package Meb;

public abstract class Member {
    protected AbstractChatroom chatroom;
    protected String name;

    public Member(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public AbstractChatroom getChatroom()
    {
        return chatroom;
    }
    public void setChatroom(AbstractChatroom chatroom)
    {
        this.chatroom = chatroom;
    }
    public void sendText(String to, String message)
    {
        System.out.println(from + "发送给" + message);
    }
    public void receiveImage(String from, String image)
    {
        System.out.println(from + "发送图片给" + image);
    }

}
