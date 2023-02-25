package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledButtonSelenium {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

           // driver.get("https://www.boat-lifestyle.com/account/login");
            driver.get("https://app.hubspot.com/login");


          /*  driver.findElement(By.xpath("//input[@id='customer[email]']")).sendKeys("suchendramishra396@gmail.com");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//input[@id='customer[password]']")).sendKeys("Hello1234*");
            Thread.sleep(3000);

            WebElement loginBtn= driver.findElement(By.xpath("//span[contains(text(),'Login')]"));

           */
            System.out.println( driver.findElement(By.cssSelector("#loginBtn")).isEnabled());

            driver.quit();

        }

    }
