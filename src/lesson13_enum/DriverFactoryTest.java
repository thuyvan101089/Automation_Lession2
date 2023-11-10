package lesson13_enum;

public class DriverFactoryTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getBrowser("safari");
        //Initializing
        driver.intDrive();
        //Testing

        // Close
        driver.closeDrive();
    }

}
