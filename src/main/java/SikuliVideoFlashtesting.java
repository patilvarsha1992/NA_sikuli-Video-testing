
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliVideoFlashtesting {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=n3rJZhmrilU");
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
		//dynamic wait 
//		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//create an object to screen class-(sikuli )
		System.out.println("1");
		Screen s= new Screen() ;
		System.out.println("2");
		Pattern gmailImg = new Pattern("p2.png");
		System.out.println("3");
		s.wait(gmailImg,2000);
		System.out.println("4");
		s.click();
		System.out.println("5");
		s.click();
		
	}

}
