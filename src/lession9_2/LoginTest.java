package lession9_2;

public class LoginTest {
    public static void main(String[] args) {
        LoginTestFlow testFlow= new LoginTestFlow("Van","12345");

        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        testFlow.loginWithCredential(internalLoginPage);
        testFlow.loginWithCredential(externalLoginPage);

    }

}
