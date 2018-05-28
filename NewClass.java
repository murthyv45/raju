package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saich\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.gmail.com");
    
    driver.findElement(By.id("identifierId")).sendKeys("murthyv45@gmail.com");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("password")).sendKeys("9966225005");
    	
}
	}
