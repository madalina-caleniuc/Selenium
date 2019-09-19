package com.Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class FirefoxTest {

    public static void main(String[] args) {

        System.out.println("Heloo");

        System.setProperty("webdriver.gecko.driver","/home/madacaleniuc/IdeaProjects/gecko/geckodriver");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://learnselenium.techcanvass.com/dropdown.html");

        Select drpdown = new Select(obj.findElement(By.name("model")));

        List<WebElement>allOptions=drpdown.getOptions();

        Iterator<WebElement>it=allOptions.iterator();
        while(it.hasNext())
        {
            WebElement el = (WebElement) it.next();
            if(el.getText().equals("Samsung Note 3"))
            {
                el.click();
                System.out.println("Test Passed");
            }
            else {
                System.out.println("Test failed");
            }
        }
    }
}
