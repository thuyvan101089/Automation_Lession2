package lesson13_enum;

public class DriverFactory {

    public static WebDriver getBrowser(PlatformType platformType){

        WebDriver driver;
        switch (platformType){
            case CHROME:
                driver =  new ChromeDriver();
                break;
            case FIREFOX:
                driver =  new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Platform can not be null");
        }
        return driver;
    }
}
