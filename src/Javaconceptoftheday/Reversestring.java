package Javaconceptoftheday;

public class Reversestring {

	static String recursiveMethod(String str)
	{
		if((null==str) || (str.length()<=1))
{
	return str;
}
return recursiveMethod(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbf = new StringBuffer("MyJava");
		System.out.println(sbf.reverse());
		
		String str1="MyJava1";
		String reverse="";
		System.out.println(str1.length());
		for(int i=str1.length()-1;i>=0;i--)
		{
			reverse=reverse+str1.charAt(i);
		}
		System.out.println(reverse);
		
		System.out.println(recursiveMethod("hellojava"));
	}

}
