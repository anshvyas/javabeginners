import java.awt.*;
import java.awt.event.*;
 import javax.swing.*; 
 class Frame12 extends JFrame
	{
		Frame12()
		{
			setSize(200,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			show();
		}
	
	}
	
	class FrameTest
		{
			public static void main(String []args)
				{
					Frame12 fr=new Frame12();
				}
		
		}