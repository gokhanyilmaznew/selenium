package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task04_01 {

    /*XPATH and CSS Selector PRACTICES
    DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
    TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
            3. Locate all the WebElements on the page using XPATH and/or CSS
    locator only (total of 6)
    a. “Home” link
    b. “Forgot password” header
    c. “E-mail” text
    d. E-mail input box
    e. “Retrieve password” button
    f. “Powered by Cydeo text
4. Verify all web elements are displayed.
    First solve the task with using cssSelector only. Try to create 2 different
    cssSelector if possible

    Then solve the task using XPATH only. Try to create 2 different
    XPATH locator if possible */




        driver.get("https://practice.cydeo.com/forgot_password");

            public static void main(String[] args) {

                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();


                driver.get("https://practice.cydeo.com/forgot_password");





    }



}
