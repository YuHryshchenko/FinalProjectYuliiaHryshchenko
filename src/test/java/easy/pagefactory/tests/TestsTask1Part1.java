package easy.pagefactory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsTask1Part1 extends BaseTest {

    private static final String SEARCH_SYMBOLS = "ru";
    private static final String SEARCH_RUSSIAN_WORD = "рыба";
    private static final String COMPARE_WORDS = "Lorem Ipsum";
    private static final String COMPARE_PHRASE = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";


    @Test(priority = 1)
    public void switchToRussianVersionSite() {
        getHomePage().setClickToRussianVersionSite();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(SEARCH_SYMBOLS));
    }

    @Test(priority = 2)
    public void textContainsTheWordFish() {
        getHomePage().setClickToRussianVersionSite();
        getBasePage().waitForElementVisibility(60, getRussionPage().openRussianText());
        Assert.assertTrue(getRussionPage().findtheRussianFirstParagraph().contains(SEARCH_RUSSIAN_WORD));
    }

    @Test(priority = 3)
    public void findLoremIpsumByDefault() {
        getHomePage().setClickToRussianVersionSite();
        getBasePage().waitForElementVisibility(60, getRussionPage().openRussianText());
        getRussionPage().clickButtonGenerateLoremIpsum();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        String actualResult = getLoremIpsumPage().generateNewLoremIpsum();
        Assert.assertEquals(COMPARE_WORDS, actualResult, "Lorem Ipsum not generated");
    }

    @Test(priority = 4)
    public void clickButtonGenerateLoremIpsum() {
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        String actualResult = getLoremIpsumPage().generateNewLoremIpsum();
        Assert.assertEquals(COMPARE_WORDS, actualResult, "Lorem Ipsum not generated");
    }

    @Test(priority = 5)
    public void firstParagraphBeginsLoremIpsumDolorSitAmet() {
        getHomePage().clickButtonGenerateEng();
        getBasePage().waitForElementVisibility(60, getLoremIpsumPage().generateLoremIpsum());
        String elementString = getLoremIpsumPage().theFirstParagraphs();
        int actualResult = elementString.indexOf(COMPARE_PHRASE);
        Assert.assertEquals(actualResult, 0);
    }
}
