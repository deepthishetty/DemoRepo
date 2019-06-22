package Javaconceptoftheday;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Finduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,12,20,12,10,20,33};
HashMap<Integer,Integer> hm=new HashMap();
for(int element:arr)
{
	if(hm.containsKey(element))
	{
		hm.put(element, hm.get(element)+1);
	}
	else
	{
		hm.put(element, 1);
	}
}
Set<Entry<Integer,Integer>> entryset=hm.entrySet();

for(Entry<Integer,Integer> entry:entryset)
{
	System.out.println(entry.getKey()+":"+entry.getValue());
}
List<Integer> list = new LinkedList<Integer>();
System.setProperty("webdriver.chrome.driver", "C:/browsers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
WebDriverWait wait=new WebDriverWait(driver,20);
//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
driver.get("http://www.google.co.in");
driver.close();
//Collections.copy(dest, src);

	}
	
	
    
    
     
    

}
