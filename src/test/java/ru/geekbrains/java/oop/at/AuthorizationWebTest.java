package ru.geekbrains.java.oop.at;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.Page.AuthorizationPage;
import ru.geekbrains.java.oop.at.Page.ContentPage;
import ru.geekbrains.java.oop.at.Page.Courses;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.block.Filters;
import ru.geekbrains.java.oop.at.block.Set;

@Epic(value = "Работа с пользователями")
@Feature("Авторизация")
@Story("Пользователь ученик")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @Description("Проверяем наличие блоков \"Тестирование ПО. Уровень 1, 2\" для авторизованного ученика")
    @Test
    @Issue("BUG-100500")
    @TmsLink("TEST-100")
    @DisplayName("Проверка наличия курсов по тестированию ПО")
    public void auth() {

        //1. Перейти на страницу авторизация https://geekbrains.ru/login
        driver.get("https://geekbrains.ru/");
        //2. Ввести логин : hks47018@eoopy.com
        //3. Пароль: hks47018
        String login = "hks47018@eoopy.com";
        String password = "hks47018";
        //4. Нажать кнопку войти
        //5. Проверить что отобразилась страница "Главная"
        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");
         //6. Нажать в навигации "Курсы"
        String namePage="Курсы";
        new ContentPage(driver).getNavigation().getButton(namePage).click();
        //contentPage.getButtonClosePopUp1().click();
        //contentPage.getButtonClosePopUp2().click();
        //7. Нажать в шапке сайта "Курсы"
        Filters filter = new Filters(driver);
        filter.getCourses().click();
        // 8. Выбрать в фильтрах чекбокс "Бесплатные"
        // 9. Выбрать в фильтрах чекбокс "Тестирование"
        filter.getFreeCourses().click();
        filter.getTesters().click();
        ContentPage contentPage = new ContentPage(driver);
        //10. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
        //11. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"
        Assertions.assertEquals(contentPage.getTest1().getText(),"Тестирование ПО. Уровень 1");
        Assertions.assertEquals(contentPage.getTest2().getText(),"Тестирование ПО. Уровень 2");
    }
}




