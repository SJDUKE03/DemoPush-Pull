package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBoxInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		//Finding the edit card
		WebElement editCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editCard.click();

		//enter the text in the text box
		WebElement textBox1 = driver.findElement(By.xpath("//*[@id=\'email\']"));
		textBox1.sendKeys("Testingbox@gh.com");

		//append text
		WebElement textBox2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		textBox2.sendKeys("Testing");

		//get the value in the box
		WebElement textBox3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		String insideText = textBox3.getAttribute("value");
		System.out.println(insideText);

		//clear the text inside the text box
		WebElement textBox4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		textBox4.clear();

		driver.navigate().back();

		WebElement buttonCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/h5"));
		buttonCard.click();

		//home page button
		WebElement homePageButton = driver.findElement(By.id("home"));
		homePageButton.click();

		//navigate back
		driver.navigate().back();

		//get the position of the button
		WebElement buttonPosition = driver.findElement(By.id("position"));
		int Xvalue = buttonPosition.getLocation().getX();
		int Yvalue = buttonPosition.getLocation().getY();
		System.out.println("X value is : "+ Xvalue + "Y value is : "+Yvalue);

		//Find the button color
		WebElement buttonColor = driver.findElement(By.id("color"));
		String color = buttonColor.getCssValue("background-color");
		System.out.println("Background color of the button is :" + color);

		//Find the size of the button
		WebElement buttonSize = driver.findElement(By.id("size"));
		int btnHeight = buttonSize.getSize().getHeight();
		int btnwidth = buttonSize.getSize().getWidth();
		System.out.println("Button height is : "+btnHeight+ "Button width is : "+btnwidth);

		//Backward
		driver.navigate().back();

		driver.quit();

	}

}
