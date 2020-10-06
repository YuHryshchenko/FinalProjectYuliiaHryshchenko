package easy.pageobject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestsTask2Part2 {

    private WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\IdeaProjects\\FinalProjectYuliiaHryshchenko\\src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://lipsum.com/");
    }

    @Test(priority = 1)
    public void name1() {
       ;
    }

    @Test(priority = 2)
    public void name2() {
        ;
    }

    @Test(priority = 3)
    public void name3() {
        ;
    }

    @Test(priority = 4)
    public void name4() {
        ;
    }

    @Test(priority = 5)
    public void name5() {
        ;
    }

    @Test(priority = 6)
    public void name6() {
        ;
    }

    @Test(priority = 7)
    public void name7() {
        ;
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
