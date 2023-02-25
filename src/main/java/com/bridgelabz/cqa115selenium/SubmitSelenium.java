package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SubmitSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.boat-lifestyle.com/account/login");

        driver.findElement(By.xpath("//input[@id='customer[email]']")).sendKeys("suchendramishra396@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='customer[password]']")).sendKeys("Hello1234*");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).submit();
        Thread.sleep(4000);

        driver.quit();
    }
}
