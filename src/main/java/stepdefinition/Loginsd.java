package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.api.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loginsd {

    WebDriver driver;
   @Given("Jump into the login page")
    public void Jump_into_the_login_page()
   {System.out.println("login page");
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://stock.scriptinglogic.net");
   }

    @When("Enter correct Username and Password")
    public void Enter_correct_Username_and_Password()
    {
        System.out.println("username and pword");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
    }

    @When("Click the Login button")
    public void Click_the_Login_button(){
       System.out.println("login button");
       driver.findElement(By.xpath("//input[@name='submit']")).click();
   }

    @Then("I should able to jump into the Main page")
    public void I_should_able_to_jump_into_the_Main_page()
    {
        System.out.println("login page");
        String expected = "https://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("this is not a dashboard",expected,actual);
    }

    @Given("browser is opend")
    public void browserIsOpend() {
       System.out.println(">>>>>>>browser is opened");
    }

    @When("url is entered")
    public void urlIsEntered() {
       System.out.println(">>>>>>>url is entered");
    }
}
