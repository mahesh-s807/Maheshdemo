import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	  @Test
	  public void f() {
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		System.out.println("checking muliple="+s.isMultiple());
		
	//	System.out.println("before checking"+s4.getText());
		//s.deselectAll();
		s.selectByVisibleText("29");
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Aug");
		System.out.println("checking muliple="+s2.isMultiple());
	List<WebElement> options=s.getOptions();
	for(WebElement s3:options) {
		//System.out.println(s3.getText());
		String checkvalue=s3.getText();
		System.out.println("test shami===="+checkvalue);
		WebElement s4=s.getFirstSelectedOption();
		System.out.println("after checking"+s4.getText());
		
	}
	}
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", 
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();//launch the browser
			driver.manage().window().maximize(); //maximize the browser
			driver.get("https://www.facebook.com/r.php");//launch the url
	  }
	}
	


