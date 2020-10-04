package easy.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoremIpsumPage extends BasePage {

    @FindBy(xpath = "//div[@id='Inner']/child::h1[contains(text(), 'Lorem Ipsum')]")
    private WebElement headerLoremIpsum;

    @FindBy(xpath = "//div[@id='Content']/descendant::p[contains(text(), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit')]")
    private WebElement findTheFirstParagraph;

    public LoremIpsumPage(WebDriver driver) {
        super(driver);
    }

    public WebElement generateLoremIpsum() {
        return headerLoremIpsum;
    }

    public String generateNewLoremIpsum() {
        return headerLoremIpsum.getText();
    }

    public String theFirstParagraph() {
        return findTheFirstParagraph.getText();
    }
}
