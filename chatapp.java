import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
class chatread extends Thread
{
	chatapp ca;
	public chatread(chatapp o)
	{
		ca=o;
	}
	public void run()
	{
		DatagramPacket dp;
		DatagramSocket ds;
		byte [] arr;
		String data;
		try
		{
			ds=new DatagramSocket(12345);
			while(true)
			{
				arr=new byte[255];
				dp=new DatagramPacket(arr,arr.length);
				ds.receive(dp);
				arr=dp.getData();
				data=new String(arr);
				data=data.trim();
				ca.jta.append(data+"/n");
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}
}


class chatapp extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel lb1,lb2;
	JTextField t1,t2;
	JTextArea jta;
	DatagramSocket ds;
	DatagramPacket dp;
	byte [] arr;
	chatread cr;
	InetAddress adr;
	JPanel p;
	JScrollPane jsp;
	public chatapp()
	{
		super("Chit Chat");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		lb1=new JLabel("   IP Address");
		lb2=new JLabel("Message");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1= new JButton("  Connect  ");
		b2= new JButton("  Send  ");
		jta=new JTextArea();
		p=new JPanel();

		p.setLayout(new GridLayout(2,3));
		p.add(lb1);
		p.add(t1);
		p.add(b1);
		p.add(lb2);
		p.add(t2);
		p.add(b2);
		jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setLayout(new BorderLayout());
		add(p,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		b1.addActionListener(this);
		b2.addActionListener(this);
		try
		{
			ds=new DatagramSocket(12346);
			cr=new chatread(this);
			cr.start();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				adr=InetAddress.getByName(t1.getText());
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage());
			}
		}
		if(ae.getSource()==b2)
		{
			try
			{
				arr=t2.getText().getBytes();
				dp=new DatagramPacket(arr,arr.length,adr,12345);
				ds.send(dp);
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage());
			}
		}
	}
	public static void main(String [] str)
	{
		new chatapp();
	}
}