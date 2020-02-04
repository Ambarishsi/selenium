package sell_proj;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class afterTeaBreak {
	static WebDriver d;
	static String x;
	static String xy = "https://www.youtube.com";
	static void chkbro()
	{	
		
		d.manage().window().maximize();
		d.get(xy);
		System.out.println("Title is : "+d.getTitle());
		//System.out.println("URL is : " +d.getCurrentUrl());
		 x=d.getCurrentUrl();
		
		
		d.close();
		
	}
	public static String chk()
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL to verify:");
		String ifeql=sc.nextLine();
		
		if(ifeql.equals(x))
		{
			return "tc pass";
		}
		else
		{
			return "tc fail";
		}
	}
	public static void main(String[] args) {
		Scanner scx = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter your Browser:\n1:Chrome\n2:Mozzila\n3:Exit\n");
		int ch=scx.nextInt();
		if(ch==2)
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\geckodriver.exe");
			d=new FirefoxDriver();
			chkbro();
			String a =chk();
			System.out.println(a);
			
			
		}
		else if(ch==1)
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
			d=new ChromeDriver();
			chkbro();
			String a =chk();
			System.out.println(a);
		}
		else if(ch==3)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("\nPlease enter valid option!");
			
		}
		}
		
		
		

	}

}
