package CucStepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestloginStepDef {
	
	WebDriver driver;
	
	@Given("^User is on Amazon HomePage$")
	public void user_is_on_Amazon_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\imtiy\\Desktop\\Selenium\\Ver 91\\chromedriver.exe");
        driver = new ChromeDriver();
	  
	  driver.get("http://amazon.in");
	  driver.manage().window().maximize();
	  
	  System.out.print("This is my FIrst Given");
	  Thread.sleep(5000);
	  
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        System.out.println("This is my when step");
        Thread.sleep(5000);
	}

	@When("^user enters valid id and password$")
	public void user_enters_valid_id_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("imtiyaz.ad@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("imtiyaz.ad@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();             
        System.out.println("This is my When step");
        Thread.sleep(5000);            
	}

	@Then("^user logs in successfully and get a success message$")
	public void user_logs_in_successfully_and_get_a_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        String CurrTitle = driver.getTitle();
        String ExpTitle = "My Title";
        //String ExpTitle = "Amazon Sign In";
        Assert.assertEquals(CurrTitle, ExpTitle);    
        driver.close();
        System.out.println("This is my then step");
	}	
	

}
