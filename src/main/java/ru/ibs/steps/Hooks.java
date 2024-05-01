package ru.ibs.steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.ibs.managers.DriverManager;
import ru.ibs.managers.TestPropManager;

import java.io.ByteArrayInputStream;

public class Hooks {
    protected static DriverManager driverManager = DriverManager.getDriverManager();
    protected static WebDriver driver = driverManager.getDriver();
    protected static final TestPropManager testPropManager = TestPropManager.getPropertyManager();

    @BeforeAll
    public static void setUp() {
        driver.get(testPropManager.getProperty("url.home"));
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            Allure.addAttachment(scenario.getId(), new ByteArrayInputStream(((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES)));
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
