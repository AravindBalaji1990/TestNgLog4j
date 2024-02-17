package testlog4jpack;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class log4jdemo {
    private static final Logger log = LogManager.getLogger(log4jdemo.class);

    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("29221JEGR00379");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setApp("/Users/aravindbalaji/Documents/Appium/Sample App/android-app.apk");
//        options.setAppPackage("com.saucelabs.mydemoapp.rn");
//        options.setAppActivity("com.saucelabs.mydemoapp.rn.MainActivity");
        options.setAppWaitForLaunch(true);
        options.setAppWaitDuration(Duration.ofMillis(50000));


        // calling the andorid driver to run the app
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        log.info("started the driver : " + driver.getDeviceTime());

        log.info("Check the value of content-desc :" +driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']")).getAttribute("content-desc"));
        WebElement elementViews = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Views']"));
        log.info("check the page source : " +driver.getPageSource());






    }
}
