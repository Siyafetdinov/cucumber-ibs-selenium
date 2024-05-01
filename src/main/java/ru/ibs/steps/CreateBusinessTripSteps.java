package ru.ibs.steps;

import io.cucumber.java.ru.И;
import ru.ibs.managers.PageManager;
import ru.ibs.pages.CreateBusinessTrip;

public class CreateBusinessTripSteps {

    /**
     * Заполняем поле подразделение
     *
     * @param businessUnit подразделение
     */
    @И("пользователь заполняет поле подразделение, значением: {string}")
    public CreateBusinessTripSteps selectBusinessUnit(String businessUnit) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.selectBusinessUnit(businessUnit);
        return this;
    }

    /**
     * Заполняем поле принимающая организация
     *
     * @param nameCompany название компании
     */
    @И("пользователь заполняет поле принимающая организация, значением: {string}")
    public CreateBusinessTripSteps selectCompany(String nameCompany) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.selectCompany(nameCompany);
        return this;
    }

    /**
     * Проставляем чекбокс заказа билетов
     */
    @И("пользователь проставляет чек-бокс заказа билетов")
    public CreateBusinessTripSteps selectOrderTickets() {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.selectOrderTickets();
        return this;
    }

    /**
     * Заполняем поле город выбытия
     *
     * @param nameCity Город
     */
    @И("пользователь заполняет поле город выбытия, значением: {string}")
    public CreateBusinessTripSteps fieldDepartureCity(String nameCity) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldDepartureCity(nameCity);
        return this;
    }

    /**
     * Заполняем поле город прибытия
     *
     * @param nameCity Город
     */
    @И("пользователь заполняет поле город прибытия, значением: {string}")
    public CreateBusinessTripSteps fieldArrivalCity(String nameCity) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldArrivalCity(nameCity);
        return this;
    }

    /**
     * Заполняем поле планируемая дата выезда
     *
     * @param date Дата
     */
    @И("пользователь заполняет поле планируемая дата выезда, значением: {string}")
    public CreateBusinessTripSteps fieldDepartureDatePlan(String date) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldDepartureDatePlan(date);
        return this;
    }

    /**
     * Заполняем поле планируемая дата возвращения
     *
     * @param date Дата
     */

    @И("пользователь заполняет поле планируемая дата возвращения, значением: {string}")
    public CreateBusinessTripSteps fieldReturnDatePlan(String date) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.fieldReturnDatePlan(date);
        return this;
    }

    /**
     * Нажимаем на кнопку сохранения
     */
    @И("пользователь нажимает на кнопку \"Сохранить и выйти\"")
    public CreateBusinessTripSteps clickSaveBtn() {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.clickBtnSaveAndExit();
        return this;
    }


    /**
     * Проверяем заполненные поля в форме
     *
     * @param nameField наименование поля
     * @param value     ожидаемое значение
     */
    @И("пользователь проверяет, что поле {string} заполнено значением: {string}")
    public CreateBusinessTripSteps checkField(String nameField, String value) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.checkField(nameField, value);
        return this;
    }

    /**
     * Проверяем что ошибки есть на странице
     *
     * @param errorText текст ошибки
     */
    @И("пользователь проверяет, что на странице отображается ошибка: {string}")
    public CreateBusinessTripSteps checkErrorMessage(String errorText) {
        CreateBusinessTrip createBusinessTrip = PageManager.getPageManager().getPage(CreateBusinessTrip.class);
        createBusinessTrip.checkError(errorText);
        return this;
    }
}
