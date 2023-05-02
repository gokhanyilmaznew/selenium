package com.cydeo.tests.seleniumexercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day05_task06 {

   /* TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
  2. Go to https://practice.cydeo.com/dropdown
 3. Select “December 1st, 1923” and verify it is selected.
    Select year using  : visible text
    Select month using   : value attribute
    Select day using : index number */

    public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("https://practice.cydeo.com/dropdrown");

        WebElement yearBox= driver.findElement(By.id("year"));
        WebElement monthBox= driver.findElement(By.id("month"));
        WebElement dayBox= driver.findElement(By.id("day"));

















}
