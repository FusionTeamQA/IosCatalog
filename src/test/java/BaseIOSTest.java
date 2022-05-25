import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseIOSTest {

    public static IOSDriver DesiredCapabilities () throws  MalformedURLException {
        //Auto-generated method stub
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
    //IOS_XCUI_Test Apple
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
    capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
    capabilities.setCapability("commandTimeouts", "12000"); //.app
    capabilities.setCapability(MobileCapabilityType.APP, "/Users/fusion_tech/Library/Developer/Xcode/DerivedData/UIKitCatalog-ajctnektmaxetrhixuysnubgyzlh/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");


        IOSDriver driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;


    }
}
