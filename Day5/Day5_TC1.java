package demoapp.sample.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://j2store.net/free/");
		dr.manage().window().maximize();
		String title=dr.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Home")) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		dr.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String title1=dr.getTitle();
		System.out.print(title1);
		if(title1.equalsIgnoreCase("Shop")) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		dr.quit();
	}
}
