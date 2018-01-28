package scenarios;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("deviceName", "<YourPhoneName>");
        //capabilities.setCapability("app", "..../apps/<your_apk_name>.apk");
        capabilities.setCapability("appPackage", "com.<your_app_name>.android");
        capabilities.setCapability("appActivity", "com.<your_app_name>.android.SplashActivity");
        capabilities.setCapability("autoDismissAlerts", true);
        capabilities.setCapability("autoDismiss", true);


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
}




