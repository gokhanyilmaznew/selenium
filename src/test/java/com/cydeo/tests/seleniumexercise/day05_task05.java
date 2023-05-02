package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day05_task05 {

   /* TC #5: Selecting state from State dropdown and verifying result
 1. Open Chrome browser
 2. Go to http://practice.cybertekschool.com/dropdown
 3. Select Illinois
 4. Select Virginia
 5. Select California
 6. Verify
    final selected option is California.
    Use all Select options. (visible text, value, index) */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdrown");

        WebElement select= driver.findElement(By.xpath("//option[.='illionis']"));
        select.click();

        WebElement CA = driver.findElement(By.xpath("//option[@value='CA']"));
        CA.click();

        Select select = new Select(WebElement select);

        if(CA.isSelected()) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}