							/******************************************************************
							
										Chat Client:SINGLE CLIENT
							
							*******************************************************************/
							
				import java.io.*;
				import java.net.*;
				import javax.swing.*;
				import java.awt.*;
				import java.awt.event.*;
				
				class ChatClient extends JFrame
					{
					
							private JPanel panel;
							private JTextField NewMsg;
							private JTextArea ChatHistory;
							private JButton Send;
							static private  ServerSocket server;
							static private Socket conn;
						 public ChatClient() 
							{
								  panel=new JPanel();
								  NewMsg=new JTextField();
								  ChatHistory=new JTextArea();
								  ChatHistory.setEditable(false);
								  Send=new JButton("Send");
								  this.setSize(500, 500);
								  this.setVisible(true);
								  setDefaultCloseOperation(EXIT_ON_CLOSE);
								  panel.setLayout(null);
								  this.add(panel);
								  ChatHistory.setBounds(20, 20, 450, 360);
								  panel.add(ChatHistory);
								  NewMsg.setBounds(20, 400, 340, 30);
								  panel.add(NewMsg);
								  Send.setBounds(375, 400, 95, 30);
								  Send.addActionListener(new Connection());
								  panel.add(Send);
								  this.setTitle("Client");	
								  
									try
										{
								  conn=new Socket("192.168.65.143",12345);
								  ChatHistory.setText("Connecting to Server");
										}
									catch(Exception ex1){ex1.printStackTrace();}	
									  try
									  { 
									   DataInputStream dis=new DataInputStream(conn.getInputStream());
									   String string=dis.readUTF();
									   ChatHistory.setText(ChatHistory.getText()+"\n Server:"+string);
									  }
									  catch (Exception e1)
									  {
									   ChatHistory.setText(ChatHistory.getText()+'\n'+"Message sending fail:Network Error");			
									  }		
							}	  
							
														class Connection implements ActionListener
								{
									public void actionPerformed(ActionEvent e) 
										{
											try
											{
											if(e.getSource()==Send && NewMsg.getText()!=null)
												{
													ChatHistory.setText(ChatHistory.getText()+"\n Client:"+NewMsg.getText());
													DataOutputStream out=new DataOutputStream(conn.getOutputStream());
													out.writeUTF(NewMsg.getText());
													out.flush();
												}
												NewMsg.setText("");
											}
										catch(Exception ex){ex.printStackTrace();}	
										}
								
								}
							
				public static void main(String []args) throws IOException
						{
							new ChatClient();
						}
					}
				