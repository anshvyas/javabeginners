
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
		class SimpleFr extends JFrame
			{
				SimpleFr()
					{
						JFrame frame=new JFrame("DEMO");
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
						JMenuBar menu=new JMenuBar();
						menu.setOpaque(true);
						menu.setBackground(new Color(200,150,100));
						menu.setPreferredSize(new Dimension(200,20));
						
						JLabel lb=new JLabel();
						lb.setOpaque(true);
						lb.setBackground(new Color(248,213,131));
						lb.setPreferredSize(new Dimension(200,180));
						
						frame.setJMenuBar(menu);
						frame.getContentPane().add(lb,BorderLayout.CENTER);
						
						frame.pack();
						frame.setVisible(true);
						
					}
				public static void main(String []args)
						{
							 javax.swing.SwingUtilities.invokeLater(new Runnable() {
								public void run() 
								{new SimpleFr();}
								
											}
							);
						}	
			
			}