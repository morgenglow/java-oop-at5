package ru.geekbrains.java.oop.at.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.block.Navigation;

public class AuthorizationPage {

    @FindBy(css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[id=\"registration-form-button\"]")
    private WebElement buttonSingIn;

    private WebDriver driver;

    private ContentPage contentPage;

    public AuthorizationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        contentPage = new ContentPage(driver);
    }

    public ContentPage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingIn.click();
        return new ContentPage(driver);
    }

    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSingIn() {
        return buttonSingIn;
    }

    public ContentPage getContentPage() {return contentPage; }
}