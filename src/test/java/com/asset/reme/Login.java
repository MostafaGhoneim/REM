package com.asset.reme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
WebDriver driver;
    @Test
    @Parameters({"username","password"})
     void test_login(String username , String password) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mostafa.ghoneim\\Downloads\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
       // System.out.println("This login");
        driver.get("http://10.0.20.77:9080/E-Remittance/faces/xhtml/home.xhtml");
        driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginId\"]")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"j_id_1e:j_id_1k:5:urlId\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"usersform\"]/div/div[1]/div/h4/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"addCompany\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"j_id_3i\"]")).sendKeys("Testt");
        driver.findElement(By.xpath("//*[@id=\"j_id_3m\"]")).sendKeys("Software");
        driver.findElement(By.xpath("//*[@id=\"j_id_3o\"]")).sendKeys("remee");
        driver.findElement(By.xpath("//*[@id=\"j_id_3q\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"j_id_3u\"]")).sendKeys("01154787887");
        driver.findElement(By.xpath("//*[@id=\"companyUserPG\"]/div[6]/div/select")).click();
        driver.findElement(By.xpath("//*[@id=\"companyUserPG\"]/div[6]/div/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"companyUserPG\"]/div[7]/div/select")).click();
        driver.findElement(By.xpath("//*[@id=\"companyUserPG\"]/div[7]/div/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"j_id_44\"]")).click();
    }
}
