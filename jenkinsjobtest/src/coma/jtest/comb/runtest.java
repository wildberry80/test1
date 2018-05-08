package coma.jtest.comb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\workspacejenkinstest\\chromeBrowser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.dem.orangehrmlive.com/");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
