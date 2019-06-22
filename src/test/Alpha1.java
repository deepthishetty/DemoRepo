package test;

public class Alpha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c='a';
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(c);
		c++;
	}
	System.out.println();
}

for(char ch='a';ch<='e';ch++)
{
for(char ch1='a';ch1<=ch;ch1++)	
{
	System.out.print(ch);
}
System.out.println();
}

for(char ch='a';ch<='e';ch++)
{
for(char ch1='a';ch1<=ch;ch1++)	
{
	System.out.print(ch1);
}
System.out.println();
}

char c1='a';
for(int i=1;i<=4;i++)
{
	for(int k=i;k<=4;k++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print(c1+" ");
		c1++;
	}
	System.out.println();
}

for(char ch='a';ch<='e';ch++)
{
	for(char k=ch;k<='e';k++)
	{
		System.out.print(" ");
	}
for(char ch1='a';ch1<=ch;ch1++)	
{
	System.out.print(ch+" ");
}
System.out.println();
}

for(char ch='a';ch<='e';ch++)
{
	for(char k=ch;k<='e';k++)
	{
		System.out.print(" ");
	}
for(char ch1='a';ch1<=ch;ch1++)	
{
	System.out.print(ch1+" ");
}
System.out.println();
}

	}

}
