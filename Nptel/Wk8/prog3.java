//import section
import java.awt.*;
import java.applet.*;

//Class section
public class prog3 extends Applet{ //inherits Applet class , we have to declare this main method as public 
								   // else it will throws an error
	//Local variable section
	int x,y,w,h;
	public void init(){
		resize(400,400);
		x = Integer.parseInt(getParameter("xval"));
		y = Integer.parseInt(getParameter("yval"));
		w = Integer.parseInt(getParameter("wval"));
		h = Integer.parseInt(getParameter("hval"));
	}
	public void paint(Graphics g){
		g.drawString("Hello World!" , 150 , 150);//g.drawString(<str> , <x> , <y>);
		g.drawRect(x,y,w,h);
	}
}