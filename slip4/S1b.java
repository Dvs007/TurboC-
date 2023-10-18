import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.swing.JApplet;
import javax.swing.*;



public class S1b extends JApplet
{
	int keySize = 60;
	String operator="";
	float first;
	float second;
	String PressedKey;
	boolean isResult = false;
	
	
    public void init()
	{
        getContentPane().setLayout(new GridLayout(2,2));
		JTextField disp = new JTextField();
		disp.setText("0");
		disp.setSize(keySize,100);
		add(disp);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setSize(4*keySize,5*keySize);
		buttonPanel.setLayout(new GridLayout(5,4));
		
		JButton btn[] = new JButton[21];
		String keyText1[] = {"C","/","*","-","+"};
		String keyText2[] = {"0",".","="};
		
		
		for(int i=1;i<=20;i++)
		{
			btn[i] = new JButton();
			btn[i].setSize(keySize,keySize);
			btn[i].setFont(new Font("Arial",Font.BOLD,15));
			buttonPanel.add(btn[i]);
			if(i<4)
			{
				btn[i].setText("");
				btn[i].setEnabled(false);
			}
			else if(i>4 && i%4 !=0 && i<16)
			    btn[i].setText(Integer.toString(i%4+3*((i/4)-1)));
			
			else if(i%4 == 0)
			    btn[i].setText(keytext1[(i/4)-1]);
			
			else
				btn[i].setText(keyText2[(i/4)-1]);
			
			
			if(i<3)
			{
				btn[i].addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						PressedKey = ((JButton)e.getSource()).getText();
						if(PressedKey.equals("C"))
						{
							first=0;
							second=0;
							disp.setText(" ");
							operator = "";
						}
						else if(PressedKey.equals("/") 
							|| PressedKey.equals("*") 
						|| PressedKey.equals("-") 
						|| PressedKey.equals("+"))
						{
							operator = PressedKey;
							first = Float.parseFloat(disp.getText());
							disp.setText("0");
						}
						else if(PressedKey.equals("="))
						{
							isResult = true;
							second = Float.parseFloat(disp.getText());
							float result = 0.0f;
							if(operator.equals("+"))
								result = first + second;
							
							else if(operator.equals("-"))
								result = first - second;

							else if(operator.equals("*"))
								result = first * second;

							else if(operator.equals("/"))
								result = first / second;
							else
							{
								print("");
							}

							disp.setText(Float.toString(result));
							
						}
						else if(PressedKey.equals("."))
						{
							if(isResult)
							{
								disp.setText("0");
								isResult = false;
							}
							else
							{
								print("");
							}
							
							if(disp.getText().contains(".")== false)
								disp.setText(disp.getText()+".");
							else
							{
								print(" ");
							}
						}
						else 
						{
							if(isResult || disp.getText().equals("0"))
							{
								disp.setText("");
								isResult = false;
							}
							else
							{
								print(" ");
							}
							disp.setText(disp.getText()+PressedKey);
						}
					
					}
				});
			}
		}
			add(buttonPanel);
		}
	}
		
		
        