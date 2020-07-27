package ru.geekbrains.java.oop.at.block;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Set extends PageFactory {
    public Set(WebDriver driver) {
        initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@data-tab='professions']//span)[1]")
    private WebElement profQty;

    @FindBy(xpath = "(//a[@data-tab='courses']//span)[1]")
    private WebElement coursesQty;

    @FindBy(xpath = "(//a[@data-tab='webinars']//span)[1]")
    private WebElement webinarsQty;

    @FindBy(xpath = "(//a[@data-tab='blogs']//span)[1]")
    private WebElement blogsQty;

    @FindBy(xpath = "(//a[@data-tab='forums']//span)[1]")
    private WebElement forumsQty;

    @FindBy(xpath = "(//a[@data-tab='tests']//span)[1]")
    private WebElement testsQty;

    @FindBy(xpath = "(//a[@data-tab='companies']//span)[1]")
    private WebElement companiesQty;
}
