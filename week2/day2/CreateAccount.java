package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class CreateAccount {

			public static void main(String[] args) throws InterruptedException {
				//Initialize the web driver
				ChromeDriver driver = new ChromeDriver();
				//Loaded the URL
				driver.get("http://leaftaps.com/opentaps/");
				//Maximize the window
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter username and password
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		        driver.findElement(By.id("password")).sendKeys("crmsfa");
		        //Click Login
		        driver.findElement(By.className("decorativeSubmit")).click();
		        
		        //Click CRM/SFA link
		        driver.findElement(By.linkText("CRM/SFA")).click();
		 
		        //click Accounts tab
		        driver.findElement(By.linkText("Accounts" )).click();
		        //Click create account
		    
		        driver.findElement(By.linkText("Create Account")).click();
		        //Enter account name, desc
		        driver.findElement(By.id("accountName")).sendKeys("Aravind");
		        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		        
		        // Select the dropdowns
		        WebElement Industry = driver.findElement(By.name("industryEnumId"));
		        Select s = new Select(Industry);
		        s.selectByVisibleText("Computer Software");
		        
		        WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		        Select s1 = new Select(Ownership);
		        s1.selectByVisibleText("S-Corporation");
		        
		        WebElement Source = driver.findElement(By.id("dataSourceId"));
		        Select s2 = new Select(Source);
		        s2.selectByValue("LEAD_EMPLOYEE");
		        
		        
                WebElement Marketing = driver.findElement(By.id("marketingCampaignId"));
		        Select s3 = new Select(Marketing);
		        s3.selectByIndex(6);
		        
		  
		        WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		        Select s4 = new Select(State);
		        s4.selectByValue("TX");
		       
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
