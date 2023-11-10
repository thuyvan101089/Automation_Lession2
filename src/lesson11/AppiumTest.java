package lesson11;

public class AppiumTest {
    public static void main(String[] args) {
        //Get from environment
        boolean isTestingOnIOS = true;
        DriverFactory driverFactory = new DriverFactory();
        AppiumDriver appiumDriver = driverFactory.getDriver(isTestingOnIOS);
        appiumDriver.init();

        //testing process happens here

        appiumDriver.quit();


    }
}
