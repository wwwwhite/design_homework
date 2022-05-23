package proxy;

public class ClocalPicShow implements IShowPic, Runnable{

    @Override
    public void run(){
        pic.ShowPic(picname);
        System.out.println(picname + "图片调用完成！");
    }

    private IShowPic pic;
    private String picname;
    @Override
    public void ShowPic(String picname){
        pic = new CRemoPic();
        this.picname = picname;
        System.out.println("准备载入图片" + picname);
        Thread th = new Thread(this);
        th.start();
    }
}
