package base;
import java.util.ResourceBundle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
public class CreateDriver {
	public WebDriver driver;
	@BeforeMethod
	public void bemt()
	{
		ResourceBundle rb=ResourceBundle.getBundle("Config");
		if(rb.getString("browser").equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(rb.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Afzal\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else
		{
			
		}
		driver.get(rb.getString("Base_URL"));
	}
}
