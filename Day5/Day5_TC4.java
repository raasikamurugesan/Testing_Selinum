package demoapp.sample.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_TC4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://j2store.net/free/");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		   Thread.sleep(1000);
		   dr.navigate().forward();
		   Thread.sleep(2000);
		   dr.navigate().back();
		   Thread.sleep(1000);
		   dr.navigate().refresh();
		   Thread.sleep(2000);
		   dr.quit();
	}
}