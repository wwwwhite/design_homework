package proxy;

public class CRemoPic implements IShowPic{

    @Override
    public void ShowPic(String picname){
        for(int i=0; i<3; i++)
        {
            System.out.println(i+1);
            Thread.sleep(1000);
        }
    }
}
