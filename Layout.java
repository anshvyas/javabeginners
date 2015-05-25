	import java.awt.*;
	import java.awt.event.*;
	
		class Layout extends Frame
			{
				private Panel txtp,btnp,btnop;
				private Button but[]=new Button[10];
				private Button btneq,btndec,btnadd,btnsub,btnmul,btndiv,btnrst;
				private TextField display;
				private int i;
				private String exp="";
				private double exp1;
				private String ch;
					Layout()
						{
							txtp=new Panel(new FlowLayout());
							display=new TextField(exp,20);
							txtp.add(display);
							display.setEditable(false);
							btnp=new Panel(new GridLayout(4,3,3,2));
							for(  i=1;i<10;++i)
								{  
									but[i]=new Button();
									but[i].setLabel(i + "");
									btnp.add(but[i]);
									but[i].addActionListener(new Calc());
									
								}
								
							btndec=new Button(".");
							btnp.add(btndec);
							btndec.addActionListener(new Calc());
							but[0]=new Button("0");
							btnp.add(but[0]);
							but[0].addActionListener(new Calc());
							btneq=new Button("=");
							btnp.add(btneq);
							btneq.addActionListener(new Oprt());
							
							btnop=new Panel(new GridLayout(1,5,2,1));
							
							btnadd=new Button("+");
							btnop.add(btnadd);
							btnadd.addActionListener(new Oprt());
							btnsub=new Button("-");
							btnop.add(btnsub);
							btnsub.addActionListener(new Oprt());
							btnmul=new Button("*");
							btnop.add(btnmul);
							btnmul.addActionListener(new Oprt());
							btndiv=new Button("/");
							btnop.add(btndiv);
							btndiv.addActionListener(new Oprt());
							btnrst=new Button("R");
							btnop.add(btnrst);
							btnrst.addActionListener(new Oprt());
						setLayout(new BorderLayout());
						add(txtp,BorderLayout.NORTH);
						add(btnp,BorderLayout.CENTER);
						add(btnop,BorderLayout.SOUTH);
						setSize(250,220);
						setVisible(true);
						setTitle("CALCULATOR");
						addWindowListener(new WindowAdapter()
						{
							public void windowClosing(WindowEvent e)
								{
									System.exit(0);
								}
						}
							);
					}		
					public class Calc implements ActionListener
						{
							public void actionPerformed(ActionEvent evt)
								{
									String btlb=evt.getActionCommand();
										exp=exp.concat(btlb);
										display.setText(exp);
								}
							}	
						public class Oprt implements ActionListener
									{
										public void actionPerformed(ActionEvent evt)
										{
											
											
											
											String btlb=evt.getActionCommand();
											if(btlb.equals("+")){exp1=Double.parseDouble(display.getText()); exp="";display.setText(btlb);ch=btlb;}
											if(btlb.equals("-")){exp1=Double.parseDouble(display.getText()); exp="";display.setText(btlb);ch=btlb;}
											if(btlb.equals("*")){exp1=Double.parseDouble(display.getText()); exp="";display.setText(btlb);ch=btlb;}
											if(btlb.equals("/")){exp1=Double.parseDouble(display.getText()); exp="";display.setText(btlb);ch=btlb;}
											if(btlb.equals("R")){exp="";display.setText(exp);}
											if(btlb.equals("=")){ 
												
												switch (ch)
													{
													case "+":
													exp1+=Double.parseDouble(display.getText());break;
													case "-":
													exp1-=Double.parseDouble(display.getText());break;
													case "*":
													exp1*=Double.parseDouble(display.getText());break;
													case "/":
													exp1/=Double.parseDouble(display.getText());break;
													}
													display.setText(exp1+"");
													exp="";
													}		
										}
									
									}
						
					public static void main(String []args)
						{
							new Layout();
						}
						
			}