package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectSelenium {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.boat-lifestyle.com/account/login");

            Rectangle rect = driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getRect();
            System.out.println("x-coordinate:" + rect.getX());
            System.out.println("y-coordinate:" + rect.getY());

            System.out.println("Height:" + rect.getHeight());
            System.out.println("width:" + rect.getWidth());
            driver.quit();
        }
    }


