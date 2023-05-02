package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_task1 {
    public static void main(String[] args) {

        /*  TC #1: Yahoo Title Verification
        1. Open Chrome browser
        2. Go to https://www.yahoo.com
        3. Verify title:
        Expected: Yahoo */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");

        }
    }

}
