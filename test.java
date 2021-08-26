package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //got to the link
        driver.get("http://automationpractice.com/index.php");
       
	WebElement element= driver.findElement(By.className("login"));
	element.click();
	element=driver.findElement(By.id("email"));
	element.sendKeys("afsana.afrin96@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("12345");
	driver.findElement(By.id("SubmitLogin")).click();
	
	
	}

}
