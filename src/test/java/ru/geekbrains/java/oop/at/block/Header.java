package ru.geekbrains.java.oop.at.block;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class Header extends PageFactory {

    public Header(WebDriver driver) {
        initElements(driver, this);
    }

    @FindBy(className ="gb-header__title")
    private WebElement headerTitle;

    @FindBy(className ="(//a[@class='show-search-form'])[1]")
    private WebElement searchForm;

    @FindBy(xpath ="(//a[@href='/login'])[1]")
    private WebElement loginButton;

    @FindBy(xpath ="(//a[@href='/register']")
    private WebElement registerButton;
}




