package Harsha;

import java.util.Scanner;

public class Checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n +" is not a prime number as it is divisible by"+i);
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(n+"is a prime number");
		}
		

	}

}
