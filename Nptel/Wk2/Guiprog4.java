import java.applet.*;
import java.awt.*;

public class Guiprog4 extends Applet{

	public void init(){
		resize(400,400);
		setBackground(Color.YELLOW);
	}
	
	public void paint(Graphics g){
		g.drawString("Code",200,200);
	}

}