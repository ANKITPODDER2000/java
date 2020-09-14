import java.applet.*;
import java.awt.*;
public class prog5 extends Applet{
	public void init(){
		resize(400 , 400);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g){
		g.drawString("Hello World!" , 120 , 120);
	}
}

/*

<!DOCTYPE html>
<html>
	<head>
		<title>Applet</title>
	</head>
	<body>
		<applet code="prog5.class" width="300" height="300" codebase="."></applet>
	</body>
</html>

*/