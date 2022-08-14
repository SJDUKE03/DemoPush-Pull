package SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.config.ConcatenatingConfig;

public class alertWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win321\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		
		//click on alert card
		WebElement alertCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/h5"));
		alertCard.click();
		
		//Working with the first alert button
		WebElement alertBtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBtn.click();
		Alert controller = driver.switchTo().alert();
		controller.accept();
		
		//working with confirmatin button 
		WebElement confirmAlertBtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmAlertBtn.click();
		Alert controller1 = driver.switchTo().alert();
		controller1.dismiss();
		
		//working with the prompt alert button
		WebElement promptAlertBtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptAlertBtn.click();
		Alert controller2 =driver.switchTo().alert();
		controller2.sendKeys("Testing with TestLeaf");
		Thread.sleep(3000);
		controller2.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
