package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Initialize the web driver
		ChromeDriver driver = new ChromeDriver();
		//Loaded the URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Click Login
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(3000);
        //Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();
        Thread.sleep(3000);
        //click Accounts tab
        driver.findElement(By.linkText("Accounts" )).click();
        //Click create account
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create Account")).click();
        //Enter account name, desc, no of emp, off site
        driver.findElement(By.id("accountName")).sendKeys("jayanthi");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("numberEmployees")).sendKeys("5");
        driver.findElement(By.id("officeSiteName")).sendKeys("Testleaf");
        Thread.sleep(3000);
        //Click Create account button
        driver.findElement(By.className("smallSubmit")).click();
        //get title page
        String title = driver.getTitle();
        if(title.contains("Account Details")) {
        	System.out.println("Account created successfull");
        }else {
        	System.out.println("Account is not created");
        }
        //Close the browser
        driver.close();
        
        
		

	}

}
