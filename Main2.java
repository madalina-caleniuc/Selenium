package com.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTest {

    public static void main(String[] args) throws InterruptedException  {

        System.setProperty("webdriver.chrome.driver","/home/madacaleniuc/IdeaProjects/chromedriver");

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("http://www.gmail.com");

        WebElement element = driver.findElement(By.id("Email"));
        element.sendKeys("xyz@gmail.com");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Click on next  button (for password)

        WebElement elementNext = driver.findElement(By.id("next"));
        elementNext.click();

        WebElement element1 = driver.findElement(By.id("Password"));
        element1.sendKeys("Password");

        WebElement elementNext1 = driver.findElement(By.id("next1"));
        elementNext1.click();

    }
}


