				/***********************************************************************************
				
					Socket Programming with Object Serialization :CLIENT
				
				************************************************************************************/
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
						
						class ComplexSocketClient
							{
							
								public static void main(String []args) throws IOException,ClassNotFoundException
									{
								Socket client=new Socket("127.0.0.1",6060);
								ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
								ObjectInputStream in=new ObjectInputStream(client.getInputStream());
								
								ComplexCompany comp=new ComplexCompany("A");
								ComplexEmployee e0=new ComplexEmployee("B",12000);
								ComplexEmployee e1=new ComplexEmployee("C",10000);
								ComplexEmployee e2=new ComplexEmployee("C",8000);
								ComplexEmployee e3=new ComplexEmployee("D",6000);
								comp.addPresident(e0);
								ComplexDepartment d1=new ComplexDepartment("Sales");
								d1.addManager(e1);
								ComplexDepartment d2=new ComplexDepartment("Production");
								d2.addManager(e2);
								ComplexDepartment d3=new ComplexDepartment("Maintenece");
								d3.addManager(e3);
								comp.addDepartment(d1);
								comp.addDepartment(d2);
								comp.addDepartment(d3);
									try
										{
								out.writeObject(comp);
										}
										catch(IOException e)
											{
								in.close();
												out.close();
												client.close();
											}
									}
							}