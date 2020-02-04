package selinium_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winswitch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com/");
	Thread.sleep(1000);
	abc(d.getTitle());
	d.findElement(By.linkText("Help")).click();
	Set <String> id = d.getWindowHandles();
	Iterator<String> it = id.iterator();
	String p = it.next();
	String c = it.next();
	Thread.sleep(1000);
	d.switchTo().window(c);
	abc(d.getTitle());
	}
 
public static void  abc(String abc)
 {
	 System.out.println(abc);
 
 }
}
