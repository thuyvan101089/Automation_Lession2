package lesson9_2;

public class InternalLoginPage extends LoginPage{
    private static final String USERNAMESECLECTOR = "#username";
    private static final String PASSWORDSECLECTOR = "#password";
    private static final String CLICKBUTTONSECLECTOR = "#clickbutton";
    @Override
    public void inputUserName(String username) {
        System.out.printf("Input %s with the selector %s \n", username,USERNAMESECLECTOR);
    }

    @Override
    public void inputPassword(String password) {
        System.out.printf("Input %s with the selector %s \n", password,PASSWORDSECLECTOR);
    }

    @Override
    public void clickButton() {
        System.out.printf("Click on login button with the selector %s\n",CLICKBUTTONSECLECTOR);
    }
}
