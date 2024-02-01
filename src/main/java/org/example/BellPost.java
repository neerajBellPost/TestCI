package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BellPost {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retaildev.bellpost.com/#/app");

//        driver.findElement(By.xpath("/html/body/flutter-view/flt-text-editing-host/input")).
//                sendKeys("testing123");

        Thread.sleep(4000);
        driver.close();

    }
}
