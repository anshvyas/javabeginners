
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	class Frame2 extends JFrame
		{
			Frame2()
				{
					 setBounds(50,50,200,100);
					 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 setVisible(true);
					 JLabel lb=new JLabel();
					 this.add(lb);
					 lb.setText("Enter Password");
					 JButton b1=new JButton("Click");
					 this.add(b1);
					 lb.getText();
				
				}
		    public static void main(String []args)
				{
					new Frame2();
				}
		}