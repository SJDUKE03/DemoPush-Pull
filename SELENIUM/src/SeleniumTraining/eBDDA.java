package SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class eBDDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win321\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");

		//click the edit card
		WebElement editCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editCard.click();

		//working with text box
		WebElement editTextBox = driver.findElement(By.id("email"));
		editTextBox.sendKeys("test@123.com");

		//working with append text box
		WebElement appendTextBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendTextBox.sendKeys("Testing will give you joy");

		//working with the get the value of the text box
		WebElement getValueBox = driver.findElement(By.name("username"));
		String textOfTheBox = getValueBox.getText();
		System.out.println("The value in the text box is : "+textOfTheBox);

		//working with the clear me text box
		WebElement clearMe = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearMe.clear();

		driver.navigate().back();

		//click on the button card
		WebElement buttonCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/h5"));
		buttonCard.click();

		//click on the home button 
		WebElement homeBtn = driver.findElement(By.id("home"));
		homeBtn.click();

		//Navigate to back 
		driver.navigate().back();

		//working with get the position of the button 
		WebElement btnPosition = driver.findElement(By.id("position"));
		int Xpoint = btnPosition.getLocation().getX();
		int Ypoint = btnPosition.getLocation().getY();
		System.out.println("The position of the X point is : "+Xpoint+"The position of the Y point is : "+Ypoint);

		//workin with get the bgc of the button
		WebElement btnColor = driver.findElement(By.id("color"));
		String colorOfBtn = btnColor.getCssValue("background-color");
		System.out.println("The color of the button is : "+colorOfBtn);

		//working with get the size of the button
		WebElement btnSize = driver.findElement(By.id("size"));
		int heightOfThebtn = btnSize.getSize().getHeight();
		int widthOfThebtn = btnSize.getSize().getWidth();
		System.out.println("The height of the button is : "+heightOfThebtn+"The Width of the button is : "+widthOfThebtn);

		//Navigate to back
		driver.navigate().back();

		//working with the dropdown card
		WebElement dropDownCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/h5"));
		dropDownCard.click();

		//working with select by index method
		WebElement byIndex = driver.findElement(By.id("dropdown1"));
		Select usingselect = new Select(byIndex);
		usingselect.selectByIndex(2);

		//working with select by value method
		WebElement byValue = driver.findElement(By.name("dropdown2"));
		Select usingValue = new Select(byValue);
		usingValue.selectByValue("3");

		//working with select by visibletext method
		WebElement byVisibleText = driver.findElement(By.id("dropdown3"));
		Select usingVisibleTetxt = new Select(byVisibleText);
		usingVisibleTetxt.selectByVisibleText("Loadrunner");

		//working with select by option & size method
		WebElement getoptions = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select getNumberOfOptons = new Select(getoptions);
		int numberOfOptions = getNumberOfOptons.getOptions().size();
		System.out.println("Number of options in the dropdown is : "+numberOfOptions);

		//working with dropdown using sendkeys
		WebElement sendLetter = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		sendLetter.sendKeys("selenium");

		//working with the multiple options
		WebElement selectMulti = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multipeValue = new Select(selectMulti);
		multipeValue.selectByIndex(1);
		multipeValue.selectByIndex(2);
		multipeValue.selectByIndex(3);
		multipeValue.selectByIndex(4);

		//Navigate to back
		driver.navigate().back();

		//Working with alert card
		WebElement alertCard = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/h5"));
		alertCard.click();

		//working with the alert button
		WebElement alertBtn1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBtn1.click();
		Alert usingAlert = driver.switchTo().alert();
		usingAlert.accept();

		//working with the alert button
		WebElement alertBtn2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		alertBtn2.click();
		Alert confirmationBtn = driver.switchTo().alert();
		confirmationBtn.accept();

		//working with the alert button
		WebElement promptBtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptBtn.click();
		Alert yesOrNoBtn = driver.switchTo().alert();
		yesOrNoBtn.sendKeys("Coffee plz");
		yesOrNoBtn.accept();
		
		//driver.close();
	}

}
