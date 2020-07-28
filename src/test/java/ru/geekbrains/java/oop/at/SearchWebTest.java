package ru.geekbrains.java.oop.at;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.Page.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Поиск")
public class SearchWebTest extends BaseWebTest {

    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @Epic(value = "Работа с навигацией")
    @Feature("Поиск")
    @Story("Неавторизованный пользователь поиск")

    @DisplayName("Проверка поиска по всем блокам")
    @Test
    void search() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.getButtonSearch().click();
        searchPage.getInputSearch().sendKeys("java");

        WebElement professionsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='professions']/span"));
        WebElement coursesCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='courses']/span"));
        WebElement eventsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='webinars']/span"));
        WebElement blogsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='blogs']/span"));
        WebElement forumsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='forums']/span"));
        WebElement testsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='tests']/span"));
        WebElement firstWebinarInList = driver.findElement(By.xpath("//a[@class='event__title h3 search_text']"));

        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getProfessions(), "Профессии"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getCourses(), "Курсы"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getEvents(), "Вебинары"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getBlogs(), "Блоги"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getForum(), "Форум"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getTests(), "Тесты"));
        wait15second.until(ExpectedConditions.textToBePresentInElement(searchPage.getProjectAndCompany(), "Проекты и компании"));

        assertThat(Integer.parseInt(professionsCount.getText()), greaterThanOrEqualTo(2));
        assertThat(Integer.parseInt(coursesCount.getText()), greaterThan(15));
        assertThat(Integer.parseInt(eventsCount.getText()), allOf(greaterThan(180), lessThan(300)));
        assertThat(Integer.parseInt(blogsCount.getText()), greaterThan(300));
        assertThat(Integer.parseInt(forumsCount.getText()), not(equalTo(350)));
        assertThat(Integer.parseInt(testsCount.getText()), not(equalTo(0)));
        assertThat(firstWebinarInList.getText(), equalTo("Java Junior. Что нужно знать для успешного собеседования?"));

    }
}