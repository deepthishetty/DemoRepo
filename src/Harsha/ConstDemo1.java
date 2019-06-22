package Harsha;
class A
{
	 A()
	{
		System.out.println("Constructor of class A");
	}
	
	static
	{
		System.out.println("SIB of class A");
	}
	{
		System.out.println("IIB of class A");
	}
}

public class ConstDemo1 {
	
	static
	{
		System.out.println("SIB of class ConstDemo1 ");
	}
	
	{
		System.out.println("IIB of class ConstDemo1 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main starts");
		A a1=new A();
		A a2=new A();
		new ConstDemo1();
		System.out.println("main ends");

	}

}
