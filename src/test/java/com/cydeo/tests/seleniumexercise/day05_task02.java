package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day05_task02 {

  /*  TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
 3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
    USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://practice.cydeo.com/radio_buttons ");
        WebElement hokey =driver.findElement(By.xpath());




    }
}
