import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    public AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "9 PKQ1.180904.001");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("app", "D:/apk/c.apk");
        caps.setCapability("automationName", "UIAutomator2");
//        caps.setCapability("newCommandTimeout", 3600);
//        caps.setCapability("connectHardwareKeyboard", true);

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    @AfterTest
    public void closeApp() {
//        driver.quit();
    }
}
