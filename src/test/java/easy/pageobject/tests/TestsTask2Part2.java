package easy.pageobject.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

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
    public void generateFindTenWords() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='words']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("10");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().split(" ").length;
        Assert.assertEquals(10, actualResult);
    }

    @Test(priority = 2)
    public void checkNegativeNullDefaultWords() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='words']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult1 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().split(" ").length;
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("0");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult2 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().split(" ").length;
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("-1");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult3 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().split(" ").length;
        Assert.assertEquals(actualResult1, actualResult2, actualResult3);
    }

    @Test(priority = 3)
    public void checkTenTwentyWords() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='words']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("10");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult1 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().split(" ").length;
        boolean compareTen = (actualResult1 == 10);
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("20");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult2 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().split(" ").length;
        boolean compareTwenty = (actualResult2 == 20);
        Assert.assertEquals(compareTen, compareTwenty);
    }

    @Test(priority = 4)
    public void generateFindTenBytes() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='bytes']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("10");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().length();
        Assert.assertEquals(10, actualResult);
    }

    @Test(priority = 5)
    public void checkNegativeNullDefaultBytes() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='bytes']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult1 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().length();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("0");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult2 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().length();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("-1");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult3 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().length();
        Assert.assertEquals(actualResult1, actualResult2, actualResult3);
    }

    @Test(priority = 6)
    public void checkTenTwentyBytes() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='bytes']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("10");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult1 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().length();
        boolean compareTen = (actualResult1 == 10);
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).clear();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='amount']")).sendKeys("20");
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int actualResult2 = driver.findElement(By.xpath("//div[@id='lipsum']//child::p")).getText().length();
        boolean compareTwenty = (actualResult2 == 20);
        Assert.assertEquals(compareTen, compareTwenty);
    }

    @Test(priority = 7)
    public void firstParagraphNotContainsLoremIpsumDolorSitAmet() {
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='start']")).click();
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String elementString = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=1]")).getText();
        int actualResult = elementString.indexOf("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        Assert.assertNotEquals(actualResult, 0);
    }

    @Test(priority = 8)
    public void numberParagraphsContainsLorem() {
        int numParagraphs = 0;
        driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Boolean[] boolArray = new Boolean[5];
        boolArray[0] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=1]")).getText().contains("lorem");
        boolArray[1] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=2]")).getText().contains("lorem");
        boolArray[2] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=3]")).getText().contains("lorem");
        boolArray[3] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=4]")).getText().contains("lorem");
        boolArray[4] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=5]")).getText().contains("lorem");
        for (Boolean aBoolean : boolArray) {
            if (aBoolean) {
                numParagraphs++;
            }
        }
        Assert.assertNotEquals(numParagraphs, 0);
    }

    @Test(priority = 9)
    public void averageNumberParagraphsContainsLorem() {
        double avgParagraphs = 0;
        Boolean[] boolArray = new Boolean[5];
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.xpath("//div[@id='Panes']//input[@id='generate']")).click();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            boolArray[0] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=1]")).getText().contains("lorem");
            boolArray[1] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=2]")).getText().contains("lorem");
            boolArray[2] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=3]")).getText().contains("lorem");
            boolArray[3] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=4]")).getText().contains("lorem");
            boolArray[4] = driver.findElement(By.xpath("//div[@id='lipsum']/child::p[position()=5]")).getText().contains("lorem");
            driver.navigate().back();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            for (Boolean aBoolean : boolArray) {
                if (aBoolean) {
                    avgParagraphs++;
                }
            }
        }
        avgParagraphs = avgParagraphs / 10;
        boolean greaterTwo = (avgParagraphs > 2);
        Assert.assertTrue(greaterTwo);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
