package com.cydeo.tests.seleniumexercise;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.scripts.JS;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day06_task01 {
   /* TC #1: Information alert practice
 1. Open browser
 2. Go to website: http://practice.cydeo.com/javascript_alerts
 3. Click to “Click for JS Alert” button
 4. Click to OK button from the alert
 5. Verify “You successfully clicked an alert” text is displayed. */


    public static void main(String[] args) throws {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button1.click();
        Alert alert =driver.switchTo().alert();
        Thread.sleep(2000);
        alert









    }




}
