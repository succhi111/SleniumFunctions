package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/reg/");

      driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
      Thread.sleep(3000);

        System.out.println(driver.findElement(By.cssSelector("input[id^='u_0_5']")).isSelected());

        driver.quit();
}
}