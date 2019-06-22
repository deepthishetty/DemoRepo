package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class Countinfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader=null;
		
		int charcount=0;
		int wordcount=0;
		int linecount=0;
		try
		{
			reader=new BufferedReader(new FileReader("C:/Deepthi143/data.txt"));
			String line=reader.readLine();
			System.out.println(line);
			while(line!=null)
			{
				String words[]=line.split(" ");
				wordcount=wordcount+words.length;
				
				for(String word:words)
				{
					charcount=charcount+word.length();
				}
				
			}
			 line=reader.readLine();
			 
			 System.out.println("line count"+linecount);
			 System.out.println("word count"+wordcount);
			 System.out.println("char count"+charcount);
		}
		catch(Exception e)
		{
			System.out.println("cannot find file");
		}
		
	}

}
