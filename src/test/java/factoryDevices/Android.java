package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy A51");
        capabilities.setCapability("platformVersion","12");
        capabilities.setCapability("appPackage","bnb.com.bo.bnbmovil");
        capabilities.setCapability("appActivity","bnb.bnbmovil.loginBiometric.FakeLauncherActivity");
        capabilities.setCapability("platformName","Android");
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        return driver;
    }
}