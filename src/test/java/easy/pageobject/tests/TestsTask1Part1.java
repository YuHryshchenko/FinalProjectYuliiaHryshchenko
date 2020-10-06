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

public class TestsTask1Part1 {

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
    public void switchToRussianVersionSite() {
        driver.findElement(By.xpath("//div[@id='Languages']//a[@class='ru' and contains(.,'Pyccкий')]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ru"));
    }

    @Test(priority = 2)
    public void textContainsTheWordFish() {
        driver.findElement(By.xpath("//div[@id='Languages']//a[@class='ru' and contains(.,'Pyccкий')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='Panes']//descendant::p[contains(., 'рыба')]")).getText();
        Assert.assertTrue(driver.getPageSource().contains("рыба"));
    }

    @Test(priority = 3)
    public void findLoremIpsumByDefault() {
        driver.findElement(By.xpath("//div[@id='Languages']//a[@class='ru' and contains(.,'Pyccкий')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actualResult = driver.findElement(By.xpath("//div[@id='Inner']/child::h1[contains(text(), 'Lorem Ipsum')]")).getText();
        Assert.assertEquals("Lorem Ipsum", actualResult, "Lorem Ipsum not generated");
    }

    @Test(priority = 4)
    public void clickButtonGenerateLoremIpsum() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actualResult = driver.findElement(By.xpath("//div[@id='Inner']/child::h1[contains(text(), 'Lorem Ipsum')]")).getText();
        Assert.assertEquals("Lorem Ipsum", actualResult, "Lorem Ipsum not generated");
    }

    @Test(priority = 5)
    public void firstParagraphBeginsLoremIpsumDolorSitAmet() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        String elementString = driver.findElement(By.xpath("//div[@id='Content']/descendant::p[contains(text(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit')]")).getText();
        int actualResult = elementString.indexOf("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        Assert.assertEquals(actualResult, 0);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
