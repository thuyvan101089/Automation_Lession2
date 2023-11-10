package lesson11;

public class IOSDriver extends AppiumDriver{
    @Override
    protected AppiumDriver init() {
        System.out.println("Init IOS driver");
        return null;
    }

    @Override
    protected void quit() {

    }
}
