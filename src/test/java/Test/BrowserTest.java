package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class BrowserTest {
	//public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver ; 
    @Test
	public void Test1() throws InterruptedException
	{
    	driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1000));
        driver.manage().window().fullscreen();
        driver.get("https://automationtalks.com/");
        driver.getTitle();
        driver.quit();
	}

}
