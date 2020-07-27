package ru.geekbrains.java.oop.at.Page;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.block.Navigation;

import static org.openqa.selenium.support.PageFactory.initElements;

public class MainPage extends PageFactory{
    private Navigation navigation;

    public MainPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

    @FindBy(xpath = "//div[@class='slogan-block']//h1[1]")
    private WebElement namePage;

    public Navigation getNavigation() {
        return navigation;
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }
}
