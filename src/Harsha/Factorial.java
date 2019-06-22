package Harsha;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println("The number entered is "+n);
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*i;
		}
		System.out.println("Factorial of " +n+ " is "+product);

	}

}
