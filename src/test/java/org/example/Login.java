package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    ChromeDriver driver=new ChromeDriver();
    public static void main(String[] args) {

    }
    public void navigate(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        try {
            driver.findElement(By.xpath("//button[@class='blu-btn b-secondary']")).click();
        }
        catch (Exception e){
            System.out.println("No pop up");
        }
    }

    public void enter(String email,String password){
            WebElement enter=driver.findElement(By.xpath("//button[@class='blu-btn btn__login b-outline b-small']"));
            enter.click();
            implicitWait(driver,3);
            WebElement emailfield = driver.findElement(By.xpath("//div[@class='blu-field b-dark']/input"));
            emailfield.click();
            emailfield.sendKeys(email);
            WebElement passwordfield = driver.findElement(By.xpath("//div[@class='blu-field login__password-container has-password b-dark']/input"));
            passwordfield.click();
            passwordfield.sendKeys(password);
            driver.findElement(By.xpath("//button[@class='blu-btn b-full-width b-secondary']")).click();
//            implicitWait(driver,2);
//            driver.findElement(By.xpath("//div[@class='header__btm']/div[@class='header__btm__left']/div[@class='brand']/a")).click();
            driver.navigate().to("https://www.blibli.com/");
    }

    public void changeLocation(){
        try{
            implicitWait(driver,7);
            WebElement pop=driver.findElement(By.xpath("//div[@class='brz-popup2__close']"));
            pop.click();
        }
        catch (Exception e){
            System.out.println("No popup");
        }

        WebElement location= driver.findElement(By.xpath("//div[@class='location-container']/div"));
        location.click();
        WebElement input=driver.findElement(By.xpath("//div[@class='blu-modal__body b-overflow-y']/div[@class='blu-field addresses__search has-placeholder has-left-icon has-custom-icon b-dark']/input[@class='form__input']"));
        input.click();
        WebElement data=driver.findElement(By.xpath("//div[@class='search__header']/div[@class='blu-field header__search-bar has-placeholder has-left-icon has-custom-icon b-dark']/input[@class='form__input']"));
        data.sendKeys("Medit");
        try{
            implicitWait(driver,2);
            WebElement pop=driver.findElement(By.xpath("//div[@class='brz-popup2__close']"));
             pop.click();
        }
        catch (Exception e){
            System.out.println("No popup");
        }
        implicitWait(driver,1);
        WebElement Mediterania=driver.findElement(By.xpath("//div[@class='search__autocomplete b-overflow-y']/div"));
        Mediterania.click();

    }
    public static  void implicitWait(WebDriver driver, int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void selectFreshbymarket(){
//        try{
//            implicitWait(driver,3);
//            WebElement pop=driver.findElement(By.xpath("//div[@class='brz-popup2__close']"));
//            pop.click();
//        }
//        catch (Exception e){
//            System.out.println("No popup");
//        }
//        implicitWait(driver,4);
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='favourite__mobile']/div[@class='favourite__mobile-wrapper']/a"));
//        System.out.println(list);
//        List<WebElement> list=driver.findElements(By.xpath("//div[@class='favourite__mobile-wrapper']/a"));
        WebElement market= driver.findElement(By.xpath("//div[@title='Fresh by Bliblimart']"));
        market.click();
        implicitWait(driver,2);
        WebElement closepopup=driver.findElement(By.xpath("//div[@class='blu-modal__footer']/button"));
        implicitWait(driver,2);
        closepopup.click();

    }

    public void selectCategory(int x){
        WebElement categoryIcon=driver.findElement(By.xpath("//div[@class='category']/div[@class='category-trigger']"));
        categoryIcon.click();
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='category-dropdown-item']"));
        WebElement susur=list.get(5);
        susur.click();
        List<WebElement> list1=driver.findElements(By.xpath("//div[@class='c2']/div[@class='category-dropdown-item']"));
        WebElement elements=list1.get(x);
        elements.click();

    }

    public void addProductDirectly(){
        implicitWait(driver,2);
        List<WebElement> productList=driver.findElements(By.xpath("//div[@class='input-stepper']"));
        WebElement product1=productList.get(1);
//        implicitWait(driver,2);
        product1.click();
//        implicitWait(driver,2);
        driver.findElement(By.xpath("//div[@class='onboarding-tooltip__footer b-footer-default']/button")).click();
        implicitWait(driver,2);
        WebElement product2=productList.get(3);
        product2.click();
    }

    public void addProduct(){
        List<WebElement> productList=driver.findElements(By.xpath("//main[@class='product-card']"));
        WebElement product1=productList.get(4);
        product1.click();
        implicitWait(driver,3);
        driver.findElement(By.xpath("//div[@class='grocery-sticky-cta__container-price-button']/button")).click();
        WebElement addQuantity=driver.findElement(By.xpath("//div[@class='blu-input-stepper']/button[@class='blu-btn blu-input-stepper__plus b-ghost b-secondary']"));
        addQuantity.click();
        addQuantity.click();

    }

    public void addRecomendedproduct(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        implicitWait(driver,2);
        WebElement navigate =driver.findElement(By.xpath("//*[@id='anchor-wrapper']/div[1]/div[1]/a[3]"));

//        js.executeScript("arguments[0].scrollIntoView();",navigate);

//        navigate.click();
        implicitWait(driver,1);
        WebElement next=driver.findElement(By.xpath("//div[@class='grocery-product-recommendation']/div[@class='header-container']/div[@class='navigation-container']/div[@class='desktop-navigation']/span[@class='container-button']"));
        next.click();
        next.click();
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='reco-list']/div"));
        System.out.println(list);
        WebElement ele=list.get(12);
        ele.findElement(By.xpath("//div[@class='grocery-product-card__container']/div[@class='product-image']/div[@class='bottom-label']")).click();

    }

    public void buy(){
        WebElement buy=driver.findElement(By.xpath("//div[@class='buy-chip']"));
        buy.click();
    }


}
