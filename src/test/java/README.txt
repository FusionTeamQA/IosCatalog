https://github.com/appium/java-client

Create Maven project

Open Pom.xml


    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>com.github.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>7.4.1</version>
        </dependency>
    </dependencies>

                                                    Setting iOS test



public class BaseIOSTest { //имя класса

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





                                                   First test
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

