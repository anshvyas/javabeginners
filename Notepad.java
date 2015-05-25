 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
	
	class Notepad extends JFrame
		{	
		
			Notepad()
				{
					JFrame note=new JFrame("NOTEPAD");
					note.setSize(300,300);
					note.setLocation(300,300);
					note.setVisible(true);
					note.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					JMenu file=new JMenu("File");
					file.add(new JMenuItem("New"));
					file.add(new JMenuItem("Open"));
					file.add(new JMenuItem("Save"));
					file.add(new JMenuItem("Exit"));
					
					JMenu edit=new JMenu("Edit");
					edit.add(new JMenuItem("Cut"));
					edit.add(new JMenuItem("Copy"));
					edit.add(new JMenuItem("Paste"));
					edit.add(new JMenuItem("Delete"));
					edit.add(new JMenuItem("Undo"));
					
					JMenu format=new JMenu("Format");
					format.add(new JMenuItem("Font"));
					
					JMenu view=new JMenu("View");
					view.add(new JMenuItem("Status Bar"));
					
					JMenuBar menu=new JMenuBar();
					menu.add(file);
					menu.add(edit);
					menu.add(format);
					menu.add(view);
					menu.setMargin(new Insets(200,200,200,200));
					note.setJMenuBar(menu);
				}
			public static void main(String []args)
				{
					SwingUtilities.invokeLater(new Runnable()
					{ 
						public void run() 
						{
						new Notepad();
						}
					}
					);
					
				}
		}
 