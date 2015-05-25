/*****************************************************************************

					Dealing with IPv4 Addresses 

******************************************************************************/

		import java.net.*;
		
		class InetAddressDemo
			{
				public static void main(String []args) throws UnknownHostException
					{
						InetAddress add=InetAddress.getLocalHost();
						System.out.println(add);
						add=InetAddress.getByName("ansh-vyas");
						System.out.println(add);
						InetAddress addr[]=InetAddress.getAllByName("localhost");
						for(int i=0;i<addr.length;++i)
							System.out.println(addr[i]);
							byte b[]=add.getAddress();
							System.out.println(new String(b,0,b.length));
					}
			}