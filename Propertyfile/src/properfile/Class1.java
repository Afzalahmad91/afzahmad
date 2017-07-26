package properfile;
import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.CreateDriver;

public class Class1 extends CreateDriver
{
	@Test
	public void tcase1()
	{
		ResourceBundle rb=ResourceBundle.getBundle("Element");
		//driver.findElement(By.id(rb.getString("login_username_id"))).sendKeys("abc");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
		//driver.findElement(By.xpath("//div[text()='Samsung Galaxy On Max (Black, 32 GB)']")).click();
		/*act.sendKeys(Keys.TAB).perform();
		act.sendKeys("abc").perform();
		act.sendKeys(Keys.RETURN).perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.ALT).sendKeys(Keys.DELETE).build().perform();*/
		//driver.findElementById(rb.getString("login_username_id")).sendKeys("afza");
		//driver.findElementByCssSelector(rb.getString("login_pass_css")).sendKeys("123");
		//driver.findElementByXPath(rb.getString("login_signin_xpath")).click();
		//driver.quit();
	}
	
}
