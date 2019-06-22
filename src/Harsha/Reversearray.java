package Harsha;

import java.util.Arrays;

public class Reversearray {
	
	static void reverse(int a[],int n)
	{
		
		int[] b=new int[n];
		int j=n;
		for(int i=0;i<n;i++) {
			b[j-1]=a[i];
			j--;
		}
		
		System.out.println(Arrays.toString(b));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,30,40,50};
reverse(arr,arr.length);

int arr1[]= {34,45,55,65,70};
reverse(arr1,arr1.length);
	}

}
