import java.applet.*;
import java.awt.*;

public class ques5 extends Applet {
    String s;
    public void init() {
        System.out.println("Inside init method");
    }

    public void start() {
        s = "Hello Java Applet";
        System.out.println("Inside start method");
    }

    public void paint(Graphics g) {
        System.out.println("Inside paint method");
        g.drawString(s, 25, 50);
    }

    public void stop() {
        System.out.println("Inside stop method");
    }

    public void destroy() {
        System.out.println("Inside destroy method");
    }
}
/*
<applet code ="ques5" width=500 height=500>
</applet>
*/