import java.applet.Applet;
import java.awt.Graphics;

public class Guiprog6 extends Applet{
	public void init(){
		resize(500,500);
	}
	public void paint(Graphics g){
		String msg = "";
		int x , y;
		msg = getParameter("msg");
		x = Integer.parseInt(getParameter("x"));
		y = Integer.parseInt(getParameter("y"));

		g.drawString(msg , x , y);
	}
}