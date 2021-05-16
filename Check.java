package constant;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize(); //maximize the browser
		driver.get("http://demo.guru99.com/test/delete_customer.php\r\n");
		driver.findElement(By.name("cusid")).sendKeys("abc");
		driver.findElement(By.name("submit")).click();
		Alert al=driver.switchTo().alert();
		String Text=al.getText();
		System.out.println(Text);
		al.accept();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
		
		
	}
	}
	


