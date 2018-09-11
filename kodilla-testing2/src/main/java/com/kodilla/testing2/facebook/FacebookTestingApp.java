package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//div[@id=\"reg_box\"]";
    public static final String XPATH_INPUT_FIRSTNAME = "//input[@name=\"firstname\"]";
    public static final String XPATH_INPUT_LASTNAME = "//input[@name=\"lastname\"]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement textFirstname = driver.findElement(By.xpath(XPATH_INPUT_FIRSTNAME));
        textFirstname.sendKeys("The robotic first name");

        WebElement textLastname = driver.findElement(By.xpath(XPATH_INPUT_LASTNAME));
        textLastname.sendKeys("The robotic last name");
        
        System.out.println("finished");
    }
}