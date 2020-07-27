package ru.geekbrains.java.oop.at.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.block.Header;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.java.oop.at.block.Navigation;

public class SearchPage extends PageFactory {

    @FindBy(css = "[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    private  WebElement buttonSearch;

    @FindBy(css = "[class=\"search-panel__search-field\"]")
    private  WebElement inputSearch;

    @FindBy(css = "[id=\"professions\"] h2")
    private WebElement professions;

    @FindBy(xpath = ".//header/h2[text()='Курсы']")
    private WebElement courses ;

    @FindBy(xpath = ".//header/h2[text()='Вебинары']")
    private WebElement events;

    @FindBy(xpath = ".//header/h2[text()='Блоги']")
    private WebElement blogs;

    @FindBy(xpath = ".//header/h2[text()='Форум']")
    private WebElement forum;

    @FindBy(xpath = ".//header/h2[text()='Тесты']")
    private WebElement tests;

    @FindBy(xpath = "//header/h2[text()='Проекты и компании']")
    private WebElement projectAndCompany;

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getButtonSearch() {
        return buttonSearch;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getProfessions() {
        return professions;
    }

    public WebElement getCourses() {
        return courses;
    }

    public WebElement getEvents() {
        return events;
    }

    public WebElement getBlogs() {
        return blogs;
    }

    public WebElement getForum() {
        return forum;
    }

    public WebElement getTests() {
        return tests;
    }

    public WebElement getProjectAndCompany() {
        return projectAndCompany;
    }
}