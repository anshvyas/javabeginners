				/******************************************************************************************
				
						Socket Programming with Object Serialization :SERVER
			
				*******************************************************************************************/
				
				import java.net.ServerSocket;
				import java.net.Socket;
				import java.io.IOException;
				import java.io.Serializable;
				import java.io.ObjectInputStream;
				import java.io.ObjectOutputStream;
				import java.util.Vector;
				import java.util.Iterator;
				
				class ComplexCompany implements Serializable
					{
					
						 private static final long serialVersionUID = 1L;
						private String name;
						private ComplexEmployee president;
						private Vector<Object>department;
						
						public ComplexCompany(String name)
							{
								this.name=name;
								department=new Vector<Object>();
							}
						public String getname(){return this.name;}
						public ComplexEmployee getPresident(){return this.president;}
						public void addPresident(ComplexEmployee e){this.president=e;}
						public void addDepartment(ComplexDepartment dept)	
							{
								department.addElement((Object)dept);
							}
						public Iterator<Object>getDepartmentIterator(){return department.iterator();}	
							public void display()
							{
								System.out.println("Company Name: "+getname());
								System.out.println("President:"+getPresident().getname()+"\n");
								Iterator<Object>i=getDepartmentIterator();
								while(i.hasNext())
									{
										ComplexDepartment dept=(ComplexDepartment)i.next();
										System.out.println("Department Name:"+dept.getname());
										System.out.println("Department Manager:"+dept.getManager().getname());
										System.out.println("Manager salary: "+dept.getManager().getsalary()+"\n");
									}
							}
					
					}
					
					class ComplexDepartment implements Serializable
						{
						 private static final long serialVersionUID = 2L;
							private String name;
							private ComplexEmployee manager;
							
							public ComplexDepartment(String name)
								{
									this.name=name;
								}
								
							public String getname(){return this.name;}
							public void addManager(ComplexEmployee e){this.manager=e;}
							public ComplexEmployee getManager(){return this.manager;}		
						
						}
						
					class ComplexEmployee implements Serializable
						{
							 private static final long serialVersionUID = 3L;
							private String name;
							private int salary;
						
							public ComplexEmployee(String name,int salary)
								{
									this.name=name;
									this.salary=salary;
								}
							
							public String getname(){return this.name;}
							public int getsalary(){return this.salary;}
						}
						
						class ComplexSocketServer
							{
							
								public static void main(String []args) throws IOException,ClassNotFoundException
									{
								ServerSocket server=new ServerSocket(6060);
								server.setSoTimeout(10000);
								Socket s;
								ComplexCompany comp;
									try
										{
									while(true)
										{
											 s=server.accept();
											ObjectInputStream in=new ObjectInputStream(s.getInputStream());
											ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
												try
													{
												while((comp=(ComplexCompany) in.readObject())!=null)
													{
														comp.display();
													}
													}
													catch(IOException e)
													{
												in.close();
												out.close();
												s.close();
													}
										}
										}
										catch(IOException e){System.out.println("Server timed out....");}
										
									}
							
							}