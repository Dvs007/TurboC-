import java.awt.*;
import java.awt.event.*;
class S1b {
	public static void main(String args[])
	{
		SlipFrame f = new SlipFrame("slip2");
	}
}

class SlipFrame extends Frame 
{
	TextField t,t1;
	Label l,l1;
	int x,y;
	Panel p;
	SlipFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		p = new Panel();
		p.setLayout(new GridLayout(2,2,5,5));
		t = new TextField(20);
		l = new Label("Co - ordianates of mouse clicked");
		l1 = new Label("Co - ordianates of mouse movement");
		t1 = new TextField(20);
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		add(p);
		addMouseListener(new MyClick());
		addMouseMotionListener(new MyMovement());
		setSize(500,500);
		setVisible(true);
	}
	class MyClick extends MouseAdapter
	{
		public void mouseClicked(MouseEvent m)
		{
			x = m.getX();
			y = m.getY();
			t.setText("X = "+x+""+"Y="+y);
			
		}
	}
	
	class MyMovement extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent n)
		{
			x = n.getX();
			y = n.getY();
			t1.setText("X = "+x+" "+"Y= "+y);
			
		}
	}
}

