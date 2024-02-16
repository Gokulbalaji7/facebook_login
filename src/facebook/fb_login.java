package facebook;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fb_login {

	public static void main(String[] args) throws Throwable {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-Origins=*");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("gokul123@gmail.com");

		WebElement findElement = driver.findElement(By.id("pass"));
		findElement.sendKeys("12345");

		TakesScreenshot obj = (TakesScreenshot) driver;
		File source = obj.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\gokul\\eclipse-workspace\\Facebook\\screenshot\\fblogin1.png");
		Thread.sleep(2000);
		org.openqa.selenium.io.FileHandler.copy(source, destination);

		System.out.println("The login is success");
	}

}
