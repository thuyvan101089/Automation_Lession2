package lesson11;

public class AndroidDriver extends AppiumDriver{
    @Override
    protected AppiumDriver init() {
        System.out.println("Init Android driver");
        return null;
    }

    @Override
    protected void quit() {

    }
}
