import java.applet.*;
import java.awt.*;

public class test extends Applet {
    String s;
    public void init() {
        System.out.println("Inside init method");
    }

    public void start() {
        s = "Welcome to Java Applet";
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
<applet code ="test" width=600 height=700>
</applet>
*/