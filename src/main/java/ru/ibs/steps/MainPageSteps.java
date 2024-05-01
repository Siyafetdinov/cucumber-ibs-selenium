package ru.ibs.steps;

import io.cucumber.java.ru.И;
import ru.ibs.managers.PageManager;
import ru.ibs.pages.BusinessTrips;
import ru.ibs.pages.MainPage;

public class MainPageSteps {
    @И("пользователь наводится на \"Расходы\" и нажимает на \"Командировки\"")
    public BusinessTripsSteps moveBusinessTrips() {
        // Шаг 3. В выплывающем окне раздела Расходы нажать на Командировки
        MainPage mainPage = PageManager.getPageManager().getPage(MainPage.class);
        mainPage.clickBusinessTripsButton();

        // Проверяем, что мы успешно перешли на страницу "Все Командировки"
        BusinessTrips businessTrips = PageManager.getPageManager().getPage(BusinessTrips.class);
        businessTrips.checkTitle();

        return new BusinessTripsSteps();
    }
}
