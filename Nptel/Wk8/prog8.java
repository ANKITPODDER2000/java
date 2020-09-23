import java.awt.*;
import java.applet.*;

class SampleFrame extends Frame{
	SampleFrame(String title){
		super(title);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);
	}

	public void paint(Graphics g){
		g.drawString("Hi" , 10 ,10);
	}
}

class MyWindowAdapter extends WindowAdapter{
	SampleFrame sf;
	public MyWindowAdapter(SampleFrame sf){
		this.sf = sf;
	}
	public void windowClosing(WindowEvent we){
		sf.setVisible(false);
	}
}

public class prog8 extends Applet{
	Frame f;
	public void init(){
		f = new SampleFrame("A frame window!");
		f.setSize(250 , 250);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
	public void paint(Graphics g){
		g.drawString("Hey i am main Applet!", 10 , 10);
	}
}