package ru.geekbrains.java.oop.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.Page.ContentPage;
import ru.geekbrains.java.oop.at.base.BaseWebTest;


import java.util.stream.Stream;

@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebTest {

//    Перейти на сайт https://geekbrains.ru/events
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
//    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)


    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @AfterEach
    void tearDown() {
        ContentPage contentPage = PageFactory.initElements(driver, ContentPage.class);

        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getFooter()));
    }
    @Epic(value = "Работа с пользователями")
    @Feature("Отображение блоков")
    @Story("Неавторизованный пользователь")

    @Test
    @Description("Проверяем наличие заголовка Блог")
    @Issue("BUG-100501")
    @TmsLink("TEST-11")
    @DisplayName("Блог")
    public void posts() {
        String namePage="Блог";
        ContentPage contentPage = new ContentPage(driver);

        contentPage.getNavigation().getButton(namePage).click();
        contentPage.getButtonClosePopUp1().click();
        contentPage.getButtonClosePopUp2().click();

        contentPage.checkNamePage(namePage);
    }


    @Description("Проверяем наличие заголовков")
    @TmsLink("TEST-12")
    @DisplayName("Заголовки страниц")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage) {
        ContentPage contentPage = new ContentPage(driver);
        contentPage.getNavigation().getButton(namePage).click();
        contentPage.checkNamePage(namePage);
    }

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Форум"),
                Arguments.of("Вебинары"),
                Arguments.of("Тесты"),
                Arguments.of("Карьера")
//                Arguments.of("Курсы", "courses")
        );
    }


}