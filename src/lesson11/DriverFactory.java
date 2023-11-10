package lesson11;

public class DriverFactory {
    public AppiumDriver getDriver (boolean isTestingOnIOS){
        if (isTestingOnIOS){
            return new IOSDriver();

        }else {
            return new AndroidDriver();
        }
    }
}
