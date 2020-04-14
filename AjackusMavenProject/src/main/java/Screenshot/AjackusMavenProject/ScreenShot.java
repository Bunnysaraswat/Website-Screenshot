/*
 * 
@ Author : Yash Saraswat  || Created On: April 14, 2020

*/
package Screenshot.AjackusMavenProject;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		
		//Defining where the Chrome Driver is Installed
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();	
		
		//Passing the URL of Website whose screenshot is to be taken
		driver.get("http://ajackus.com/");
		driver.manage().window().maximize();
		
		//Taking Screenshot of the Website
		Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		//Saving Taken screenshot to a particular folder
		ImageIO.write(Screenshot.getImage(), "jpg", new File("C:\\Users\\HP\\Downloads\\ScreenShot_Image\\FullPageScreenshot.png"));
		}
	}