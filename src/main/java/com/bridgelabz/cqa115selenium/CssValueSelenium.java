package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValueSelenium {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.boat-lifestyle.com/account/login");

            String font = driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getCssValue("font-family");
            System.out.println(font);

            driver.quit();
        }
    }
