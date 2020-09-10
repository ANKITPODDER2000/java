//import section
import java.awt.*;
import java.applet.*;

//Class section
public class prog1 extends Applet{ //inherits Applet class , we have to declare this main method as public 
								   // else it will throws an error
	public void paint(Graphics g){
		g.drawString("Hello World!" , 150 , 150);//g.drawString(<str> , <x> , <y>);
	}
}