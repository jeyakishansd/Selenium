package Maven.DataDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static  WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Driver\\msedgedriver.exe"));
				driver = new EdgeDriver();
			}
			else {
				System.out.println("Invalid Browser");
			}
		}
			catch (Exception e) {
				e.printStackTrace();
		}
		return driver;
		}
		public static void getUrl(String url) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void sendkeys(WebElement element , String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void clickonElement(WebElement element) {
			waitForElementVisibilty(element);
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void waitForElementVisibilty(WebElement element) {
			
		}
		public static void dropDown(WebElement element, String Options , String Value) {
			Select s = new Select(element);
			try {
				if (Options.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(Value);
					s.selectByIndex(parseInt);
				}else if (Options.equalsIgnoreCase("byValue")) {
					s.selectByValue(Value);
				} else if (Options.equalsIgnoreCase("byVisibleText")) {
					s.selectByVisibleText(Value);
				}
				else {
					System.out.println("Invalid Selection");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}