package Techfios.MavenP;




import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintestjunit {
	 WebDriver driver;
	 @Test
	 public void lauch(){
			

			System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\MavenP\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://techfios.com/test/billing/?ng=admin/");
			driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
			
			driver.close();
			
			
		
			
		}
}
