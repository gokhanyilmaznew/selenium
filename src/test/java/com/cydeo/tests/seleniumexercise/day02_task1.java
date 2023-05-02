package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_task1 {

    public static void main(String[] args) {

       /* TC #1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
        Expected: cydeo
        4. Verify title:
        Expected: Practice*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com ");

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("URL passed");
        } else {
            System.out.println("URL failed");

            String expectedTitle = "Practice";
            String actualTitle = driver.getTitle();


        }
    }


}