	import java.awt.*;
	import java.awt.event.*;
		public class Counter2 extends Frame
			{
				private Button btup,btdn,btrst;
				private TextField txt;
				private int count=0;
					Counter2()
						{
							setLayout(new FlowLayout());
							add(new Label("Count: "));
							txt=new TextField("0",10);
							add(txt);
							txt.setEditable(false);
							btup=new Button("UP");
							add(btup);
							btup.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
									{
										++count;
										txt.setText(count+"");
									}
									
								});	
							btdn=new Button("DOWN");
							add(btdn);
							btdn.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
									{
										--count;
										txt.setText(count+"");
									}		
							
							
							});
							
							btrst=new Button("RESET");
							add(btrst);
							btrst.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e)
									{
										count=0;
										txt.setText(count+"");
									}
							});
						
						setSize(400,200);
						setVisible(true);
						setTitle("Counter");
						}
				public static void main(String []args)
						{new Counter2();}
				
			}