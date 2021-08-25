package com.demobroadleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumdemowebsite {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Driver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().fullscreen();
        driver.get("https://demo.broadleafcommerce.org/");
        Thread.sleep(2000);

        WebElement sauceElement = driver.findElement(By.xpath("//div[@data-id='8']"));
        sauceElement.click();
        Thread.sleep(1000);

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='btn btn-primary js-addToCart']"));
        addToCart.click();
        Thread.sleep(1000);

        WebElement viewCart = driver.findElement(By.xpath("//i[@class='material-icons']"));
        viewCart.click();
        Thread.sleep(1000);

        WebElement vCart = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        vCart.click();
        Thread.sleep(1000);

        WebElement checkOut = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        checkOut.click();
        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.id("username"));
        userName.clear();
        userName.sendKeys("MNAYEM0704@GMAIL.COM");
        Thread.sleep(2000);

        WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
        passwordElement.sendKeys("Password123");
        Thread.sleep(2000);

        WebElement logInElement = driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
        logInElement.click();
        Thread.sleep(2000);

        WebElement fullName= driver.findElement(By.xpath("//input[@id='fullName']"));
        fullName.clear();
        fullName.sendKeys("MOHAMMAD NAYEM");
        Thread.sleep(2000);

        WebElement addRess = driver.findElement(By.xpath("//input[@id='addressLine1']"));
        addRess.clear();
        addRess.sendKeys("1245 calm st");
        Thread.sleep(2000);

        WebElement addRESS = driver.findElement(By.xpath("//input[@id='addressLine2']"));
        addRESS.clear();
        addRESS.sendKeys("Apt 2 Punch");
        Thread.sleep(2000);

        WebElement cityElement = driver.findElement(By.xpath("//input[@id='city']"));
        cityElement.clear();
        cityElement.sendKeys("CrazyCity");
        Thread.sleep(2000);

        WebElement stateElement = driver.findElement(By.id("stateProvinceRegion"));
        Select select = new Select(stateElement);
        select.selectByValue("NY");
        Thread.sleep(2000);

        WebElement postalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
        postalCode.clear();
        postalCode.sendKeys("54321");
        Thread.sleep(2000);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='phonePrimary']"));
        phoneNumber.clear();
        phoneNumber.sendKeys("3216549987");
        Thread.sleep(2000);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement shippingMethod = driver.findElement(By.id("fulfillmentOptionId2"));
        js.executeScript("arguments[0].click();",shippingMethod);
        Thread.sleep(2000);

        WebElement continueElement =driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitCheckoutStage']"));
        continueElement.click();
        Thread.sleep(2000);

        WebElement fullName1 = driver.findElement(By.xpath("//input[@id='fullName'][1]"));
        fullName1.sendKeys("NAYEM MOHAMMAD");
        Thread.sleep(2000);

        WebElement addressElement = driver.findElement(By.xpath("//input[@id='addressLine1'][1]"));
        addressElement.sendKeys("1245 Nicer Road");
        Thread.sleep(2000);

        WebElement addRESSElement = driver.findElement(By.xpath("//input[@id='addressLine2'][1]"));
        addRESSElement.sendKeys("Apt 2 Good");
        Thread.sleep(2000);

        WebElement cityElement1 = driver.findElement(By.xpath("//input[@id='city'][1]"));
        cityElement1.sendKeys("Empire City");
        Thread.sleep(2000);

        WebElement provinceElement = driver.findElement(By.xpath("//select[@name='address.stateProvinceRegion'][1]"));
        Select newSelect = new Select(provinceElement);
        newSelect.selectByValue("NJ");
        Thread.sleep(2000);

        WebElement postalCode1 = driver.findElement(By.xpath("//input[@id='postalCode'][1]"));
        postalCode1.sendKeys("12456");
        Thread.sleep(2000);

        WebElement phoneNumber1 = driver.findElement(By.xpath("//input[@id='phonePrimary'][1]"));
        phoneNumber1.sendKeys("3216549987");
        Thread.sleep(2000);

        WebElement emailElement = driver.findElement(By.xpath("//input[@id='emailAddress']"));
        emailElement.clear();
        emailElement.sendKeys("MNAYEM0704@GMAIL.COM");
        Thread.sleep(2000);

        WebElement cardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
        cardNumber.clear();
        cardNumber.sendKeys("4475-4544-987758");
        Thread.sleep(2000);

        WebElement securityCode = driver.findElement(By.xpath("//input[@id='securityCode']"));
        securityCode.clear();
        securityCode.sendKeys("325");
        Thread.sleep(2000);

        WebElement cardExpire = driver.findElement(By.xpath("//input[@id='cardExpDate']"));
        cardExpire.clear();
        cardExpire.sendKeys("05/55");
        Thread.sleep(2000);

        WebElement continueElement1 =driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitPaymentCheckoutStage'][1]"));
        continueElement1.click();
        Thread.sleep(2000);

        WebElement placeOrder = driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-performCheckout']"));
        placeOrder.click();
        Thread.sleep(2500);

        driver.quit();





    }

}



