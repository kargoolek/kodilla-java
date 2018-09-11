package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//div[@id=\"reg_box\"]";
    public static final String XPATH_INPUT_FIRSTNAME = "//input[@name=\"firstname\"]";
    public static final String XPATH_INPUT_LASTNAME = "//input[@name=\"lastname\"]";
    public static final String XPATH_SELECT_DAY = "//select[@name=\"birthday_day\"]";
    public static final String XPATH_SELECT_MONTH = "//select[@name=\"birthday_month\"]";
    public static final String XPATH_SELECT_YEAR = "//select[@name=\"birthday_year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement textFirstname = driver.findElement(By.xpath(XPATH_INPUT_FIRSTNAME));
        textFirstname.sendKeys("The robotic first name");

        WebElement textLastname = driver.findElement(By.xpath(XPATH_INPUT_LASTNAME));
        textLastname.sendKeys("The robotic last name");

        //EXERCISE 23.3 -> going to select 14.02.2018
        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayCombo = new Select(selectDay);
        selectDayCombo.selectByValue("14");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthCombo = new Select(selectMonth);
        selectMonthCombo.selectByIndex(2);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearCombo = new Select(selectYear);
        selectYearCombo.selectByValue("2018");

        System.out.println("finished");
    }
}