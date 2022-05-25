import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.HashMap;

public class Sliders extends BaseIOSTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = DesiredCapabilities();
        driver.findElementByAccessibilityId("Sliders").click();
        IOSElement slider = (IOSElement) driver.findElementByXPath("//XCUIElementTypeSlider");//обязательно обернуть для слайдеров
        slider.setValue("0%");
        slider.setValue("0.5%"); //0 - 1 ("0%" - 0%, "1%" - 100%, "0.5%" - 50%
    }
}