package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PruebasUca {

    public WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickBuscarConFirefox(){
        WebElement BuscarFireBtn;
        WebElement BuscarFireBtnII;
        WebElement BuscarFireBtnIII;
        WebElement BuscarFireBtnIIII;
        WebElement BuscarFireBtnV;
        WebElement BuscarFireBtnVI;
        WebElement BuscarFireBtnVII;
        WebElement BuscarFireBtnVIII;

        BuscarFireBtn = driver.findElement(By.cssSelector("#user-name"));
        BuscarFireBtn.click();
        BuscarFireBtn.sendKeys("standard_user");
        BuscarFireBtnII = driver.findElement(By.cssSelector("#password"));
        BuscarFireBtnII.click();
        BuscarFireBtnII.sendKeys("secret_sauce");
        BuscarFireBtnIII = driver.findElement(By.cssSelector("#login-button"));
        BuscarFireBtnIII.click();
        BuscarFireBtnIIII = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        BuscarFireBtnIIII.click();
        BuscarFireBtnV = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
        BuscarFireBtnV.click();
        BuscarFireBtnVI = driver.findElement(By.cssSelector("#remove-sauce-labs-backpack"));
        BuscarFireBtnVI.click();
        BuscarFireBtnVII = driver.findElement(By.cssSelector("#shopping_cart_container > a"));
        BuscarFireBtnVII.click();
        BuscarFireBtnVIII = driver.findElement(By.cssSelector("#checkout"));
        BuscarFireBtnVIII.click();




    }
    @Test
    public void test(){
        setUp();
        clickBuscarConFirefox();
        //driver.quit();
    }
}

