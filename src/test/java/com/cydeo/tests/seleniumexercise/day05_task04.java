package com.cydeo.tests.seleniumexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day05_task04 {
    /*TC#4: Verifying “Simple dropdown” and “State selection” dropdown
    default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
            3. Verify “Simple dropdown” default selected value is correct
    Expected: “Please select an option”
            4. Verify “State selection” default selected value is correct
    Expected: “Select a State” */

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://practice.cydeo.com/dropdown");

        WebElement optionElementSelect = driver.findElement(By.xpath());


    }

}
