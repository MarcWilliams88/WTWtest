package Verification;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Location {
	
	static WebDriver driver = null;
	
	
	 public static void main(String[] args){
	      
	System.setProperty("webdriver.chrome.driver", "C:/Users/marcw/Desktop/DEV/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("Browser is open");
	driver.get("https://www.willistowerswatson.com/ICT");
	
	//WebDriverWait wait = new WebDriverWait(driver, 40);
	//wait.until(ExpectedConditions.numberOfWindowsToBe(1));
			
			//elementToBeClickable(By.id("pop-div03596980083915491")));

	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]")).click();
	//driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/section[1]/div[1]/button[1]/i[2]")).click();
	//driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/section[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")).click();
	//driver.findElement(By.linkText("English")).click();
	
	

	
	}
	}

