package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	
	@Test
	public void reg() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Chaii");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("UK");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("chaithusonu12");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("9380771322");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("9380771322");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		driver.close();

	}
}
