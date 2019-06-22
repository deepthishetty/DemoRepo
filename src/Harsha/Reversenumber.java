package Harsha;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
		Scanner input=new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("The number entered is "+number);
		int n=number;
		int reversenum=0;
		int reverse=0;
		while(n!=0)
		{
			reverse=n%10;
			reversenum=reversenum*10+reverse;
			n=n/10;
			
			
			
		}
		
		System.out.println(reversenum);
	}

}
