package demoapp.sample.Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_TC3 {
    public static void main(String[] args) {
        // Set the path to your Chrome driver
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://j2store.net/free/");

        // Click on the Clothing link
        WebElement clothingLink = driver.findElement(By.linkText("Clothing"));
        clothingLink.click();

        // Wait for the page to load
        try {
            Thread.sleep(2000); // Adjust the delay as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find and print the names of the items displayed on the screen
        List<WebElement> itemNames = driver.findElements(By.className("item-name"));
        for (WebElement itemName : itemNames) {
            System.out.println(itemName.getText());
        }

        // Close the browser
        driver.quit();
    }
}