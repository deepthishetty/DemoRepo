package Javaconceptoftheday;

public class Arraysorting {
	
	public static void findDuplicatesUsingBruteForce(int[] inputarray)
	{
		for(int i=0;i<inputarray.length;i++)
		{
			for(int j=i+1;j<inputarray.length;j++)
			{
				if(inputarray[i]==inputarray[j])
				{
					System.out.println(inputarray[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
		 findDuplicatesUsingBruteForce(new int[] {111, 334, 555, 779, 339, 444, 555});
		 
		 

	}

}
