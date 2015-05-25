	import java.awt.*;
	import java.awt.event.*;
		class Mouse extends Frame implements WindowListener,MouseListener,MouseMotionListener
			{
				private TextField txtX;
				private TextField txtY;
				private TextField posX,posY;
					Mouse()
						{
							setLayout(new FlowLayout(FlowLayout.CENTER));
							setBackground(new Color(150,150,250));
							add(new Label("X-click"));
							txtX=new TextField("0",10);
							add(txtX);
							txtX.setEditable(false);
							
							add(new Label("Y-click"));
							txtY=new TextField("0",10);
							add(txtY);
							txtY.setEditable(false);
							
							add(new Label("X-Pos: "));
							posX=new TextField("0",10);
							add(posX);
							posX.setEditable(false);
							
							add(new Label("Y-Pos"));
							posY=new TextField("0",10);
							add(posY);
							posY.setEditable(false);
							
							
							addMouseListener(this);
							addWindowListener(this);
							addMouseMotionListener(this);
							
							setTitle("Mouse Position");
							setSize(350,150);
							setVisible(true);
						}
						
				 public void windowClosing(WindowEvent e) {
					System.exit(0);  // Terminate the program
									}
 
   // Not Used, but need to provide an empty body
   
   public void windowOpened(WindowEvent e) { }
   
   public void windowClosed(WindowEvent e) { }
   
   public void windowIconified(WindowEvent e) {  setSize(100,50); }
   
   public void windowDeiconified(WindowEvent e) { setSize(350,200); }
   
   public void windowActivated(WindowEvent e) {
   }
   
   public void windowDeactivated(WindowEvent e) { }		
   
    
   public void mouseClicked(MouseEvent clck) {
      txtX.setText(clck.getX() + "");
      txtY.setText(clck.getY() + "");
   }
 
   
   public void mousePressed(MouseEvent e) { }
   
   public void mouseReleased(MouseEvent e) { }
   
   public void mouseEntered(MouseEvent e) { }
   
   public void mouseExited(MouseEvent e) { }
   
   public void mouseMoved(MouseEvent e) {
      posX.setText(e.getX() + "");
      posY.setText(e.getY() + "");
   }
 
   // Not Used, but need to provide an empty body for compilation
   
   public void mouseDragged(MouseEvent e) { }
   
   public static void main(String []args)
	{new Mouse();}
			}