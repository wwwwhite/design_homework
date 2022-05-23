package Bri;

import com.sun.xml.internal.ws.util.xml.XmlUtil;

public class Client {
    public static void main(String a[])
    {
        Color color;
        Pen pen;

        color = (Color) XmlUtilPen.getBean("color");
        pen = (Pen)XmlUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("鲜花");
    }
}
