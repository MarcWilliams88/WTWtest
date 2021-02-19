package Verification;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Location {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void Browser_is_open() {
	
		String projectPath = System.getProperty("User.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "DEV/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    	System.out.println("Browser is open");
    	    	
        driver.get("https:willistowerswatson.com/ict");
	}
	
	@And("User is on homepage")
	public void User_is_on_homepage() {
		
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //cookie pop-up handle
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]")).click();
       //Click on US/EN 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/section[1]/div[1]/button[1]/i[2]")).click();
      //Select United States
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/section[2]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")).click();
       //Select English
        driver.findElement(By.linkText("English")).click();    
	}
	
	@When("Check sorting")
	public void Check_sorting() {
		 //Search
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//i[contains(text(),'search')]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/input[1]")).sendKeys("IFRS 17");
        
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='coveo9de96e90']")).click();
	}
	
	@And("Filter")
	public void Filter(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("div[1]/div[2]/div[1]/div[4]/div[1]/ul[1]/li[1]/label[1]/div[1]/div[1]")).click();
	}
	
	@Then("Validate Article")
	public void Validate_Article() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String confirmText = driver.findElement(By.xpath("1")).getText();
		Assert.assertTrue("https://www.willistowerswatson.com/en-US/", confirmText.contains("en-US"));
	}
	}
