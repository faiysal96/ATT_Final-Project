package maven_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClickonContactsTest {
	
	@Test
	public void workshopmethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		//WebDriver w = new ChromeDriver();
		WebDriver w = new FirefoxDriver();
		w.get("http://localhost/new/Web.php");
		w.manage().window().maximize();
		w.findElement(By.xpath("/html/body/div[1]/form/a[3]")).click();		
		
	}

}
