package lesson9_2;

public class LoginTestFlow {
    private String username;
    private String password;

    public LoginTestFlow(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void loginWithCredential(LoginPage loginPage){
        loginPage.inputUserName(this.username);
        loginPage.inputPassword(this.password);
        loginPage.clickButton();
    }
}
