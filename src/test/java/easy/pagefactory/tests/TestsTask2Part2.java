package easy.pagefactory.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestsTask2Part2 extends BaseTest {

    private static final String ENTER_NUMBERS1 = "10";
    private static final String ENTER_NUMBERS2 = "0";
    private static final String ENTER_NUMBERS3 = "-1";
    private static final String ENTER_NUMBERS4 = "20";
    private static final String ENTER_DEFAULT_PHRASE = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
    private static final String ENTER_KEYWORD = "lorem";

    @Test(priority = 1)
    public void generateFindTenWords() {
        getHomePage().clickSelectParameterWords();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS1);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult = getLoremIpsumPage().lengthFirstLine();
        Assert.assertEquals(actualResult,10);
    }

    @Test(priority = 2)
    public void checkNegativeNullDefaultWords() {
        getHomePage().clickSelectParameterWords();
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult1 = getLoremIpsumPage().lengthFirstLine();
        getDriver().navigate().back();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS2);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult2 = getLoremIpsumPage().lengthFirstLine();
        getDriver().navigate().back();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS3);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult3 = getLoremIpsumPage().lengthFirstLine();
        Assert.assertEquals(actualResult1, actualResult2, actualResult3);
    }

    @Test(priority = 3)
    public void checkTenTwentyWords() {
        getHomePage().clickSelectParameterWords();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS1);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult1 = getLoremIpsumPage().lengthFirstLine();
        boolean compareTen = (actualResult1 == 10);
        getDriver().navigate().back();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS4);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult2 = getLoremIpsumPage().lengthFirstLine();
        boolean compareTwenty = (actualResult2 == 20);
        Assert.assertEquals(compareTen, compareTwenty);
    }

    @Test(priority = 4)
    public void generateFindTenBytes() {
        getHomePage().clickSelectParameterBytes();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS1);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult = getLoremIpsumPage().lengthSymbolsFirstLine();
        Assert.assertEquals(10, actualResult);
    }

    @Test(priority = 5)
    public void checkNegativeNullDefaultBytes() {
        getHomePage().clickSelectParameterBytes();
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult1 = getLoremIpsumPage().lengthSymbolsFirstLine();
        getDriver().navigate().back();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS2);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult2 = getLoremIpsumPage().lengthSymbolsFirstLine();
        getDriver().navigate().back();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS3);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult3 = getLoremIpsumPage().lengthSymbolsFirstLine();
        Assert.assertEquals(actualResult1, actualResult2, actualResult3);
    }

    @Test(priority = 6)
    public void checkTenTwentyBytes() {
        getHomePage().clickSelectParameterBytes();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS1);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult1 = getLoremIpsumPage().lengthSymbolsFirstLine();
        boolean compareTen = (actualResult1 == 10);
        getDriver().navigate().back();
        getHomePage().clickClearNumericField();
        getHomePage().enterValueNumericField(ENTER_NUMBERS4);
        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        int actualResult2 = getLoremIpsumPage().lengthSymbolsFirstLine();
        boolean compareTwenty = (actualResult2 == 20);
        Assert.assertEquals(compareTen, compareTwenty);
    }

    @Test(priority = 7)
    public void firstParagraphNotContainsLoremIpsumDolorSitAmet() {
        getHomePage().clickStartWithLoremIpsum();
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        String elementString = getLoremIpsumPage().theParagraphsOnFirstPosition();
        int actualResult = elementString.indexOf(ENTER_DEFAULT_PHRASE);
        Assert.assertNotEquals(actualResult, 0);
    }

    @Test(priority = 8)
    public void numberParagraphsContainsLorem() {
        int numParagraphs = 0;
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        Boolean[] boolArray = new Boolean[5];
        boolArray[0] = getLoremIpsumPage().theParagraphsOnFirstPositionContainsLorem(ENTER_KEYWORD);
        boolArray[1] = getLoremIpsumPage().theParagraphsOnSecondPositionContainsLorem(ENTER_KEYWORD);
        boolArray[2] = getLoremIpsumPage().theParagraphsOnThirdPositionContainsLorem(ENTER_KEYWORD);
        boolArray[3] = getLoremIpsumPage().theParagraphsOnForthPositionContainsLorem(ENTER_KEYWORD);
        boolArray[4] = getLoremIpsumPage().theParagraphsOnFifthPositionContainsLorem(ENTER_KEYWORD);
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
            getHomePage().clickButtonGenerateEng();
            getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
            boolArray[0] = getLoremIpsumPage().theParagraphsOnFirstPositionContainsLorem(ENTER_KEYWORD);
            boolArray[1] = getLoremIpsumPage().theParagraphsOnSecondPositionContainsLorem(ENTER_KEYWORD);
            boolArray[2] = getLoremIpsumPage().theParagraphsOnThirdPositionContainsLorem(ENTER_KEYWORD);
            boolArray[3] = getLoremIpsumPage().theParagraphsOnForthPositionContainsLorem(ENTER_KEYWORD);
            boolArray[4] = getLoremIpsumPage().theParagraphsOnFifthPositionContainsLorem(ENTER_KEYWORD);
            getDriver().navigate().back();
            getBasePage().waitForElementVisibility(60, getHomePage().headerHomePageLoremIpsum());
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

}
