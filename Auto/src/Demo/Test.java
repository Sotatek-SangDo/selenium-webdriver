package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// path chrome executable file
		String OS = System.getProperty("os.name").toLowerCase();
		String exePath = System.getProperty("user.dir");
		if(OS.indexOf("mac") >= 0) {
			exePath += "/chromedriver";
		} else {
			exePath = "\\chromedriver.exe";
		}
		System.out.println("path: " + exePath);
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		driver.quit();

	}

}
