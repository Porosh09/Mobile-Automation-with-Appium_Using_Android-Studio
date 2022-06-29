import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Ecommerce_TC_1 extends Base {
	
	public static void main (String[]args) throws MalformedURLException {
	
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Fuad");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("\"new UiScrollable(new UiSelector().scrollable(true).scrollIntoView(new UiSelector().textContains(\\\"Bangladesh\\\")"));
		driver.findElement(By.xpath("//*[@text='Bangladesh']")).click();
		
		//driver.findElement(By.className("android.widget.TextView")).click();
	
	
}

	
}