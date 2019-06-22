package test;

import java.util.Arrays;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,3,4,5,6,77,77,2,4,9,2};
int uniqueelem=arr.length;
//int arrclean[]=new int[arr.length];
for(int i=0;i<uniqueelem;i++)
{
	for(int j=i+1;j<uniqueelem;j++)
	{
		if(arr[i]==arr[j])
		{
			
			arr[j]=arr[uniqueelem-1];
			uniqueelem--;
			j--;
		}
	}
}

int arrclean[]=Arrays.copyOf(arr, uniqueelem);

System.out.println(Arrays.toString(arrclean));
	}

}
