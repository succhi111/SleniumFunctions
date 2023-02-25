package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyByUrl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.boat-lifestyle.com/account/login");

        driver.findElement(By.xpath("//input[@id='customer[email]']")).sendKeys("suchendramishra396@gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='customer[password]']")).sendKeys("Hello1234*");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
        Thread.sleep(3000);

        String actualUrl=driver.getCurrentUrl();
        System.out.println("URL of the page: " +actualUrl);
        String expectedUrl="https://www.boat-lifestyle.com/account";

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("HOME PAGE IS LOADED By URL");
        }
        else {
            System.out.println("homepage is not loaded");
        }
         driver.quit();
    }
}
