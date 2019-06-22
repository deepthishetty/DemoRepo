package Harsha;

abstract class abstractdemo {
	String value;
	abstractdemo()
	{
		this.value="hello";
		System.out.println("constructor of abstract class");
	}
	
	

}
public class Demo extends abstractdemo
{
	Demo()
	{

	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		String val = d.value;
		System.out.println(val);
	}
}
