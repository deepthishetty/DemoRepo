package Harsha;

public class Nonstaticdemo {
int i,j;
static int k=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nonstaticdemo n1=new Nonstaticdemo();
		System.out.println(n1.i);
		System.out.println(n1.j);
		//int nk = n1.k;
		
		Nonstaticdemo n2=new Nonstaticdemo();
		System.out.println(n2.i);
		System.out.println(n2.j);
		
		System.out.println(new Nonstaticdemo().i);
		System.out.println(new Nonstaticdemo().j);
		n2.i=123;
		n2.j=456;
		
		System.out.println(n1.i);
		System.out.println(n1.j);
		System.out.println(n2.i);
		System.out.println(n2.j);
	}
	
	{
		System.out.println("IIB1");
		i=20;j=30;
	}
	
	{
		System.out.println("IIB2");
		i=200;j=300;
	}
	{
		i=222;
		j=333;
	}

}
