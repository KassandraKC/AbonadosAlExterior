package singletonSession;

import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {

    private static Session session=null;
    private AppiumDriver driver;
    private Session(){
        try {
            driver = FactoryDevice.make("android").create();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }
    public void closeApp(){
        driver.quit();
        session=null;
    }
    public AppiumDriver getDriver(){
        return driver;
    }
}