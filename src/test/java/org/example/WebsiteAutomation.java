package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteAutomation {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openDiy(){
        driver.get("https://www.diy.com/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(15000);
        driver.manage().window().minimize();
        driver.close();
    }
}
