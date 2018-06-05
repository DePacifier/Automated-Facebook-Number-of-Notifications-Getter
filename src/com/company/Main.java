package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your password:");
        String password =sc.next();
        sc.close();

        facebookAutomate(name,password);

    }
    public static void facebookAutomate(String name, String password){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.navigate().refresh();

        WebElement emailBox = driver.findElement(By.name("email"));
        WebElement passBox = driver.findElement(By.name("pass"));

        emailBox.sendKeys(name);
        passBox.sendKeys(password);
        passBox.submit();

        WebElement notification = driver.findElement(By.id("notificationsCountValue"));
        String notCount = notification.getText();
        System.out.println("You have got " + notCount + " pending notifications.");

        try{
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        driver.close();
    }

    public static void portalLogin(String UserName, String Password){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://portal.aait.edu.et");

        driver.navigate().refresh();

        WebElement usrNameBox = driver.findElement(By.name("UserName"));
        WebElement passBox = driver.findElement(By.name("Password"));

        usrNameBox.click();
        usrNameBox.sendKeys(UserName);
        passBox.click();
        passBox.sendKeys(Password);

        passBox.submit();

        try{
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        driver.close();
    }
    /*
    public static void method1(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Length of page Source" + driver.getPageSource().toString().length());

        try{
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        driver.close();
    }

    public static void method2(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        driver.navigate().to("https://www.google.com");

        driver.navigate().refresh();

        driver.navigate().back();

        driver.navigate().forward();

        driver.close();

    }


    public static void method3(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchbox = driver.findElement(By.name("q"));

        searchbox.sendKeys("Addis Ababa University");
        searchbox.click();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        searchbox.clear();

        driver.close();

    }*/
}
