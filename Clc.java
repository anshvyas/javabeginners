import java.awt.*;
	import java.awt.event.*;
	
		class Clc extends Frame
			{
				private Panel txtp,btnp,btnop;
				private Button but[]=new Button[10];
				private Button btneq,btndec,btnadd,btnsub,btnmul,btndiv;
				private TextField display;
				private int i;
				private static String exp="";
				private double exp1,exp2,res;
				private String ch;
					Clc()
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
							//btneq.addActionListener(new Oprt());
							
							btnop=new Panel(new GridLayout(1,4,2,1));
							
							btnadd=new Button("+");
							btnop.add(btnadd);
							//btnadd.addActionListener(new Oprt());
							btnsub=new Button("-");
							btnop.add(btnsub);
							//btnsub.addActionListener(new Oprt());
							btnmul=new Button("*");
							btnop.add(btnmul);
							//btnmul.addActionListener(new Oprt());
							btndiv=new Button("/");
							btnop.add(btndiv);
							//btndiv.addActionListener(new Oprt());
							
							
						setLayout(new BorderLayout());
						add(txtp,BorderLayout.NORTH);
						add(btnp,BorderLayout.CENTER);
						add(btnop,BorderLayout.SOUTH);
						setSize(200,200);
						setVisible(true);
						//System.out.println(but);
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
										if(btlb.equals("1")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("2")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("3")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("4")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("5")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("6")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("7")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("8")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("9")){ display.setText(exp.concat(btlb));}
										if(btlb.equals("0")){ display.setText(exp.concat(btlb));}
										if(btlb.equals(".")){ display.setText(exp.concat(btlb));}
										exp=exp.concat(btlb);
										System.out.println(exp);
								}
							}	
							
								
					public static void main(String []args)
						{
							new Clc();
						}	
			}			