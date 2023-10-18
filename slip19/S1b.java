import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.event.KeyListener.*;

public class S1b extends Applet implements MouseListener,KeyListener
{
	private int x,y;
	private String str="";
	
	public void init()
	{
		this.addMouseListener(this);
		this.addKeyListener(this);
		
	}
	public void paint(Graphics g)
	{
		g.drawString(str,x,y);
		
	}
	public void MouseClicked(MouseEvent m)
	{
		x = m.getX();
		y = m.getY();
		str = "x="+x+",y="+y;
		repaint();
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Released");
	}
	public void keyTyped(KeyEvent ke)
	{
		str +=ke.getKeyChar();
		repaint();
	}
	public void mouseEntered(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		str = "x="+x+",y="+y;
		repaint();
	}
	public void mouseExited(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		str = "Mouse is exited in"+x+",y="+y+"co-ordiantes";
	
		repaint();
	}
	public void mousePressed(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		str = "x="+x+",y="+y;
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		str = "Mouse released at"+x+",y="+y+"co-ordiantes";
	
		repaint();
	}
	
}