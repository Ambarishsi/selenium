package sell_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleDemo {
	static String a,b,x;
	//static WebDriver driver;
	public static String chk()
	{	
		if(x.equals(b))
		{
			return "tc pass";
		}
		else
		{
			return "tc fail";
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		 
		x = driver.findElement(By.name("q")).getAttribute("value");
		
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		b=driver.findElement(By.name("q")).getAttribute("value");
		//a = driver.findElement(By.id("resultStats")).getText();
		//System.out.println(a);
		//System.out.println(chk());
		driver.quit();
	}

}
