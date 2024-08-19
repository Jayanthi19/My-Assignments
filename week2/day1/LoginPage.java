package week2.day1;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("testleaf2023@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("Tuna@321");
	    driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println("successfull");
		} else {
			System.out.println("not successfull");
			 driver.close();
		}

	   
	    
	}

}
