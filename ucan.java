package selinium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ucan {
	static WebDriver d;
	static String mExpanse;
	static String mIncome;
	
	static String[] mx0 = {"100", "200", "300"};
	static String[] mx1 = {"10", "20", "30"};
	static String[] mx2 = {"50", "75", "100"};
	static String[] mx3 = {"500", "100", "400"};
	static String[] mx4 = {"50", "20", "10"};
	
	static void calc() throws Exception
	{
		for (int i=0; i<3;i++)
		{
			d.findElement(By.id("food")).sendKeys(mx0[i]);
			d.findElement(By.id("clothing")).sendKeys(mx1[i]);
			d.findElement(By.id("shelter")).sendKeys(mx2[i]);
			d.findElement(By.id("monthlyPay")).sendKeys(mx3[i]);
			d.findElement(By.id("monthlyOther")).sendKeys(mx4[i]);
			Thread.sleep(1000);
			System.out.println( "\n----------"+( i+1) +" iteration----------\n");
		mExpanse = d.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Monthly expanse is: " +mExpanse);
		mIncome = d.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("Monthly income is: " +mIncome);
			Thread.sleep(1000);
		float fmExpanse = Float.parseFloat(mExpanse);
		float fmIncome = Float.parseFloat(mIncome);
		if(fmExpanse>fmIncome)
		{
			System.out.println("You are very poor in savings");
		}
		else
		{
			System.out.println("You are waren Buffet");
		}
		d.findElement(By.className("reset")).click();
		Thread.sleep(1000);
		}
	}
	
	static void setValue() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		d=new ChromeDriver();
		Actions act = new Actions(d);
		d.manage().window().maximize();
		d.get("http://www.youcandealwithit.com/");
		Thread.sleep(2000);
		act.moveToElement(d.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"))).build().perform();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.className("calculatorsLink")).click();
		Thread.sleep(1000);
		d.findElement(By.partialLinkText("Budget Calculator")).click();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws Exception {
		
		setValue();
		calc();
		d.quit();
	}
		

	}


