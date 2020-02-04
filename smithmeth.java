package sell_proj;

import java.io.File;
import java.io.IOException;
//import java.awt.AWTException;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class smithmeth {
	public WebDriver d;
	//public String x;
	public String xy = "https://www.youtube.com";
	
	/*public void yeahbro()
	{
		
		System.out.println(chkbro());
	}*/
	
	public void chkbro() throws IOException
	{	
	
		d.manage().window().maximize();
		d.get(xy);
		
		//System.out.println("Title is : "+d.getTitle());
		//System.out.println("URL is : " +d.getCurrentUrl());
		//x=d.getCurrentUrl();
		System.out.println(chk());
		
		System.out.println(closebro());
	
		
	}
	public String chk() throws IOException
	{	
		
		if(xy.equals(d.getCurrentUrl()))
		{
			return "tc001 pass";
		}
		else
		{
			File scrFile = (File)((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File("E:\\ss\\tc001.jpg"));
			return "tc001 fail";
		}
	}
	
	public void browser() throws IOException
	{
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
			
			
			
		}
		else if(ch==1)
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
			d=new ChromeDriver();
			chkbro();
			
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
	public String closebro()
	{	String xf ="browser closing fail";
		d.close();
		 xf ="browser closing pass";
		 return xf;
	}

}
