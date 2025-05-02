import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("javascript tutorial",Keys.ENTER);
		driver.findElement(By.linkText("JS Objects")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Try it Yourself »")).click();
		
	}
	

}
