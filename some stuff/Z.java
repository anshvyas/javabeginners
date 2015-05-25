class A extends Thread {
public void run (){
System.out.println("hii ");

}
}
class z{
public static void main (String ar[])
{
A a=new A();
Thread t =new Thread (a);
t.start ();

}

}
