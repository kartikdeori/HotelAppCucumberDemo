package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
	@Given("User is on HotelApp")
	public void user_is_on_hotel_app() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\kartik\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		
	}

	@When("User enters Username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement uname=driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");
	}

	@When("User enters Password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("vasu1234");
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("login_button")).click();
	}

	@Then("Login is Successful")
	public void login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Greeting=driver.findElement(By.name("username_show"));
		String actualOutput=Greeting.getAttribute("value");
	}

}
