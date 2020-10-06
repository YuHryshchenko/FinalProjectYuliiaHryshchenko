package easy.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RussianPage extends BasePage {

    @FindBy(xpath = "//div[@id='Inner']//child::h5")
    private WebElement russianText;

    @FindBy(xpath = "//div[@id='Panes']//descendant::p[contains(., 'рыба')]")
    private WebElement russianFirstParagraph;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='generate']")
    private WebElement buttonGenerateLoremIpsum;

    public RussianPage(WebDriver driver) {
        super(driver);
    }

    public WebElement openRussianText() {
        return russianText;
    }

    public String findtheRussianFirstParagraph() {
        return russianFirstParagraph.getText();
    }

    public void clickButtonGenerateLoremIpsum() {
        buttonGenerateLoremIpsum.click();
    }
}
