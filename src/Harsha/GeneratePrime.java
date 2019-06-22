
package Harsha;

import java.util.Scanner;

public class GeneratePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the range");
Scanner input=new Scanner(System.in);
int range=input.nextInt();
for(int i=3;i<range;i++)
{
	boolean flag=true;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=false;
			
		}
	}
	if(flag)
	{
		System.out.println(i);
	}
	
	
	}

System.out.println("to generate 100 prime numbers");

int firstprime=3;
int counter=1;

while(counter<=100)
{
	int j;
	for(j=2;j<firstprime;j++)
	{
		
		boolean flag=true;
		if(firstprime%j==0)
		{
			j=2;		
			break;
			
		}
	}
		if(j==firstprime)
		{
			System.out.println("The prime number at"+counter+"is"+j);
			counter++;
		}
		firstprime++;
		
	
	
}


}
}
