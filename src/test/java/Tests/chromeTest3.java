package Tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class chromeTest3 {





    @Test
    public static void test3() throws MalformedURLException {

        /*
        SELENIUM HUB INTEGRATION
         */

        //Desired Capabilites class called to create Object
        DesiredCapabilities cap = new DesiredCapabilities();
        // set capabilities with cap variable from desired capabilities class to use chrome
        cap.setCapability("browserName","chrome");
        // using Url class to create new url object to then use with localhost and mapping with port number
        // in docker to send to Remote WebDriver
        URL u = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(u,cap);
        // Selenium get method to go to url inside docker
        driver.get("http://yahoo.com");
        String title = driver.getTitle();
        // Print out Title
        System.out.println(title);
        System.out.println("Docker Test Ended");

    }


}
