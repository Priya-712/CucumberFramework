package testdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
	}

	@And("user entered valid username")
	public void user_entered_valid_username() {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  
	  
	}

	@And("User entered valid password")
	public void user_entered_valid_password() {
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");  
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();   
	}

	@Then("User redirect to the homepage")
	public void user_redirect_to_the_homepage() {
	  System.out.println(driver.getCurrentUrl()); 
	}


}
