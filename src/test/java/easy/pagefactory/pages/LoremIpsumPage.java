package easy.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoremIpsumPage extends BasePage {

    @FindBy(xpath = "//div[@id='Inner']/child::h1[contains(text(), 'Lorem Ipsum')]")
    private WebElement headerLoremIpsum;

    @FindBy(xpath = "//div[@id='Content']/descendant::p[contains(text(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit')]")
    private WebElement findFirstParagraphs;

    @FindBy(xpath = "//div[@id='lipsum']//child::p")
    private WebElement findFirstLine;

    @FindBy(xpath = "//div[@id='lipsum']/child::p[position()=1]")
    private WebElement findParagraphsOnFirstPosition;

    @FindBy(xpath = "//div[@id='lipsum']/child::p[position()=2]")
    private WebElement findParagraphsOnSecondPosition;

    @FindBy(xpath = "//div[@id='lipsum']/child::p[position()=3]")
    private WebElement findParagraphsOnThirdPosition;

    @FindBy(xpath = "//div[@id='lipsum']/child::p[position()=4]")
    private WebElement findParagraphsOnForthPosition;

    @FindBy(xpath = "//div[@id='lipsum']/child::p[position()=5]")
    private WebElement findParagraphsOnFifthPosition;

    public LoremIpsumPage(WebDriver driver) {
        super(driver);
    }

    public WebElement generateLoremIpsum() {
        return headerLoremIpsum;
    }

    public String generateNewLoremIpsum() {
        return headerLoremIpsum.getText();
    }

    public String theFirstParagraphs() {
        return findFirstParagraphs.getText();
    }

    public int lengthFirstLine() {
        return findFirstLine.getText().split(" ").length;
    }

    public int lengthSymbolsFirstLine() {
        return findFirstLine.getText().length();
    }

    public String theParagraphsOnFirstPosition() {
        return findParagraphsOnFirstPosition.getText();
    }

    public Boolean theParagraphsOnFirstPositionContainsLorem(String keyword) {
        return findParagraphsOnFirstPosition.getText().contains(keyword);
    }

    public Boolean theParagraphsOnSecondPositionContainsLorem(String keyword) {
        return findParagraphsOnSecondPosition.getText().contains(keyword);
    }

    public Boolean theParagraphsOnThirdPositionContainsLorem(String keyword) {
        return findParagraphsOnThirdPosition.getText().contains(keyword);
    }

    public Boolean theParagraphsOnForthPositionContainsLorem(String keyword) {
        return findParagraphsOnForthPosition.getText().contains(keyword);
    }

    public Boolean theParagraphsOnFifthPositionContainsLorem(String keyword) {
        return findParagraphsOnFifthPosition.getText().contains(keyword);
    }

}
