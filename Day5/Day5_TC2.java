package demoapp.sample.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_TC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://j2store.net/free/");
		dr.manage().window().maximize();
		
		String url="https://j2store.net/free/";
		dr.get(url);
		String curl=dr.getCurrentUrl();
		if(curl.equals("https://j2store.net/free/")) {
			System.out.print("valid");
		}
		else {
			System.out.print("invalid");
		}
		dr.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String url1="https://j2store.net/free/index.php/shop?filter_catid=11";
		dr.get(url1);
		String curl1=dr.getCurrentUrl();
		if(curl1.equals("https://j2store.net/free/index.php/shop?filter_catid=11")) {
			System.out.print("valid");
		}
		else {
			System.out.print("invalid");
		}
		dr.quit();
	}

}