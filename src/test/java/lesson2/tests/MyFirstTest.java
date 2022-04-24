package lesson2.tests;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstTest {
    @Test
    public void RunGoogleCards() throws MalformedURLException {
        // Устанавливаем capabilities.
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");

//        Пример для google-карт
        capabilities.setCapability("appPackage", "com.google.android.apps.maps");
        capabilities.setCapability("appActivity", "com.google.android.maps.MapsActivity");
        capabilities.setCapability("noReset", true);
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
