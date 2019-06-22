package Harsha;

public class Fibonacci20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo1=0;
		int fibo2=1;
		int fibo3;
		for(int i=1;i<=18;i++)
		{
			fibo3=fibo1+fibo2;
			System.out.println(fibo3);
			fibo1=fibo2;
			fibo2=fibo3;
		}
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.println("Fibonacci numbers within 10000");
		
		do
		{
			System.out.println(fib3);
			fib3=fib1+fib2;
			
			fib1=fib2;
			fib2=fib3;
		}
		while(fib3<=10000);
		
		

	}

}
