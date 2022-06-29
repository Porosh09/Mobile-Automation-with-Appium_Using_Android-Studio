import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	@SuppressWarnings("deprecation")
	//public static void main (String[]args) throws MalformedURLException
	
	public static AndroidDriver  capabilities() throws MalformedURLException
	{
		
		AndroidDriver driver;
		
		File f=new File("src");
		File fs= new File(f,"General-Store.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "FuadDevice");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver; 
	}

}

