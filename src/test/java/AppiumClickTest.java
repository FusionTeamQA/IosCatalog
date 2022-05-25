import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class AppiumClickTest extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = DesiredCapabilities();
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Text Entry']").click();
        driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
        driver.findElementByAccessibilityId("OK").click();
        driver.findElementByAccessibilityId("Confirm / Cancel").click();
        System.out.println(driver.findElementByXPath("//*[contains(@name, 'message')]").getText());
        driver.findElementByAccessibilityId("Confirm").click();
        driver.quit();
    }
}