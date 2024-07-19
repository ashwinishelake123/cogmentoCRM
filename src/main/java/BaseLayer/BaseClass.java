package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
    protected static Properties prop ;
    protected static FileInputStream fis;
    protected static WebDriver driver;
    
	public BaseClass() {
		
		 prop = new Properties();
		String path = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/Config.properties";
		try {
			 fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash\\Desktop\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		String url= prop.getProperty("URL");
		driver.get(url);
		
	}
}
