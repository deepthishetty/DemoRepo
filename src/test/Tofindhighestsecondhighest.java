package test;

import java.util.Arrays;
import java.util.Scanner;

public class Tofindhighestsecondhighest {

	public static void main(String args[])
	{
		int arr[]= {11,23,32,21,45,46};
	

int highest=0;
int secondhighest=0;

for(int j=0;j<arr.length;j++)
{
	if(arr[j]>highest)
	{
		
		secondhighest=highest;
		highest=arr[j];
	}
	else if(arr[j]>secondhighest)
	{
		secondhighest=arr[j];
	}
}
System.out.println(highest);
System.out.println(secondhighest);
	}

}
