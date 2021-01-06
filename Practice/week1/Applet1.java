import java.applet.Applet;
import java.awt.*;

public class Applet1 extends Applet {
    public int x = 10, y = 10, width = 100, height = 100;

    public void init() {
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        width = Integer.parseInt(getParameter("width"));
        height = Integer.parseInt(getParameter("height"));
        resize(400,400);
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
        g.drawString("Hello World", 170, 200);
    }
}
