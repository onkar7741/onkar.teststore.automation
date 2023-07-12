package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		
		if(driver == null) {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
			}
			
			if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new EdgeDriver(options);
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get(url);
		}
		return driver;
	}
}
