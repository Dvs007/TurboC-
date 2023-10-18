import javax.swing.*;
import java.awt.*;
class S1b extends JFrame 
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JButton b1,b2;
	JRadioButton rb1,rb2;
	JCheckBox cb1,cb2,b3;
	JPanel p1,p2,p3,p4,p5,p6;
	GridLayout g1,g2,g3,g4,g5,g6,g7;
	JFrame jf;
	public S1b()
	{
		jf = new JFrame();
		l1 = new Jlabel("",JLabel.CENTER);
		l1.setText("<HTML><U>Personal information</U></HTML>");
		p1= new Panel();
		g1 = new GridLayout(1,1);
		p1.setLayout(g1);
		p1.add(l1);
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l2 = new Jlabel("First name:");
		t1 = new JTextField(30);
		l3 = new Jlabel("Last name:");
		t2 = new JTextField(30);
		p2 = new Panel();
		g2 = new GridLayout(2,1);
		p2.setLayout(g2);
		p2.add(l2);
		p2.add(t1);
		p2.add(l3);
		p2.add(t2);
		l4 = new JLabel("Address");
		t3 = new JTextField(30);
		l5 = new JLabel("Mobile number");
		t4 = new JTextField(30);
		p3 = new Panel();
		g3 = new GridLayout(2,1);
		p3.setLayout(g3);
		p3.add(l4);
		p3.add(t3);
		p3.add(l5);
		p3.add(t4);
		
		l5 = new JLabel("Gender");
		rb1 = new JRadioButton("male");
		rb2 = new JRadioButton("female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		p4 = new Panel();
		g4 = new GridLayout(1,2);
		p4.setLayout(g4);
		p4.add(l5);
		p4.add(rb1);
		p4.add(rb2);
		
		l6 = new JLabel("Your interest");
		cb1 = new JCheckBox("computer");
		cb2 = new JCheckBox("Sports");
		cb3 = new JCheckBox("Music");
		
		p5 = new JPanel();
		g5 = new GridLayout(1,2);
		p5.setLayout(g5);
		p5.add(l6);
		p5.add(cb1);
		p5.add(cb2);
		p5.add(cb3);
		
		b1 = new JButton("Submit");
		b2 = new JButton("reset");
		p6 = new Panel();
		g6 = new GridLayout(1,1,400,10);
		p6.add(b1);
		p6.add(b2);
		this.setSize(500,300);
		this.setVisible(true);
		g7 = new GridLayout(6,1);
		this.setLayout(g7);
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(p5);
		this.add(p6);
		
		
		
	}
	
	public static void main(String args[])
	{
		new S1b();
	}
}