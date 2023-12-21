package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FreshbyMarket {
//    Login login=new Login();
//    WebDriver driver=login.driver;

    public static void main(String[] args) {

    }
//    public void select_freshbymarket(){
//        implicitWait(driver,4);
//        WebElement button=driver.findElement(By.xpath("//a[@class='favourite__item']/div[@title='Fresh by Bliblimart']"));
//        button.click();
//    }
    public static  void implicitWait(WebDriver driver, int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
}
