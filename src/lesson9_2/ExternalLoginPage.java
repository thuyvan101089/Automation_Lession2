package lesson9_2;

public class ExternalLoginPage extends LoginPage{
    private static final String USERNAMESECLECTOR = "#username_ext";
    private static final String PASSWORDSECLECTOR = "#password_ext";
    private static final String CLICKBUTTONSECLECTOR = "#clickbutton_ext";
    @Override
    public void inputUserName(String username) {
        System.out.printf("Input %s with the selector %s\n", username,USERNAMESECLECTOR);
    }

    @Override
    public void inputPassword(String password) {
        System.out.printf("Input %s with the selector %s\n", password,PASSWORDSECLECTOR);
    }

    @Override
    public void clickButton() {
        System.out.printf("Click on login button with the selector %s",CLICKBUTTONSECLECTOR);
    }
}
