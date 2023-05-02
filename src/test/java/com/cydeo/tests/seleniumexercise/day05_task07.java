package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day05_task07 {
    /*TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
 3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up” */


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropdownLink = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']");
        WebElement facebook = driver.findElement(By.xpath("//a[@[.=Facebook']"));
        facebook.click();

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle) {
            System.out.println("Title is PASSED");
        }else {
            System.out.println("Title is FAİLED");
        }
    }

}
