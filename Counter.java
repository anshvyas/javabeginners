import java.awt.*;
import java.awt.event.*;
	public class Counter extends Frame implements ActionListener
		{
			private Label lb;
			private Button bt;
			private TextField txt;
			private int count =0;
				
				public Counter()
					{
						setLayout(new FlowLayout());
						lb=new Label("Counter");
						add(lb);
						txt=new TextField("0",12);
						txt.setEditable(false);
						add(txt);
						bt=new Button("Click");
						add(bt);
						bt.addActionListener(this);
						setTitle("COUNTER");
						setSize(250,100);
						
						
						System.out.println(this);
						System.out.println(lb);
						System.out.println(txt);
						System.out.println(bt);
						
						
						setVisible(true);
						
						
						System.out.println(this);
						System.out.println(lb);
						System.out.println(txt);
						System.out.println(bt);
						
					}
				public static void main(String []args)
					{
					Counter ct=new Counter();
					
					}
				//@Override
					public void actionPerformed(ActionEvent evt)
						{
							++count;
							txt.setText(count+"");
						}
		}