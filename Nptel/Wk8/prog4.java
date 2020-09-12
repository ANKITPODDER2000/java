import java.applet.*;
import java.awt.*;

public class prog4 extends Applet{
	String msg = "";
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		resize(500,500);
		msg += "inside init()  -->>  ";
	}
	public void start(){
		msg += "inside start()  -->>  ";
	}
	public void paint(Graphics g){
		msg += "inside paint()  -->>  ";
		g.drawString(msg , 20 , 100);
		g.drawRect(10,130,100,100);
	}
}