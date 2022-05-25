import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.HashMap;

public class ScrollTest extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = DesiredCapabilities();
        //scroll
        HashMap<String , Object>scrollObject = new HashMap<>(); //настройка скролла
        scrollObject.put("direction","down"); //down - вниз, up - ввех
        scrollObject.put("name", "Web View"); // name - тип, Web View - искать такое значение


        driver.executeScript("mobile:scroll", scrollObject); // применение скролла
        driver.findElementByAccessibilityId("Web View").click();
        driver.quit();


    }
}