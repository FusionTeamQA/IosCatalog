import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.HashMap;

public class BackAndPicker extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = DesiredCapabilities();
        //scroll
        HashMap<String , Object>scrollObject = new HashMap<>(); //настройка скролла
        scrollObject.put("direction","down"); //down - вниз, up - ввех
        scrollObject.put("name", "Web View"); // name - тип, Web View - искать такое значение


        driver.executeScript("mobile:scroll", scrollObject); // применение скролла
        driver.findElementByAccessibilityId("Web View").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Red color component value").sendKeys("85");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("230");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("100");
    }
}