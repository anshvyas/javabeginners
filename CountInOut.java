	import java.awt.*;
	import java.awt.event.*;
	class CountInOut extends Frame
		{
			private Button bt;
			private TextField txt;
			private int count=0;
				public CountInOut()
					{
						setLayout(new FlowLayout());
						add(new Label("Click Count: "));
						txt=new TextField("0",10);
						add(txt);
						txt.setEditable(false);
						bt=new Button("Click!!!");
						add(bt);
						bt.addActionListener(new Counter());
						setSize(250,150);
						setTitle("Counter Nested Classes ");
						setVisible(true);
					}
		
			private class Counter implements ActionListener
				{
					public void actionPerformed(ActionEvent evt)
						{
							++count;
							txt.setText(count+"");
						}
				}
		public static void main(String []args)
				{
					new CountInOut();
				}
		
		}