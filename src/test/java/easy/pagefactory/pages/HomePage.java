package easy.pagefactory.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='Inner']/child::h1[contains(text(), 'Lorem Ipsum')]")
    private WebElement headerLoremIpsum;

    @FindBy(xpath = "//div[@id='Languages']//a[@class='ru' and contains(.,'Pyccкий')]")
    private WebElement clickToRussianVersionSite;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='generate']")
    private WebElement buttonGenerateEng;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='words']")
    private WebElement selectParameterWords;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='amount']")
    private WebElement NumericField;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='bytes']")
    private WebElement selectParameterBytes;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='start']")
    private WebElement selectStartWithLoremIpsum;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement headerHomePageLoremIpsum() {
        return headerLoremIpsum;
    }

    public void setClickToRussianVersionSite() {
        clickToRussianVersionSite.click();
    }

    public void clickButtonGenerateEng() {
        buttonGenerateEng.click();
    }

    public void clickSelectParameterWords() {
        selectParameterWords.click();
    }

    public void clickClearNumericField() {
        NumericField.clear();
    }

    public void enterValueNumericField(String keyword) {
        NumericField.sendKeys(keyword);
    }

    public void clickSelectParameterBytes() {
        selectParameterBytes.click();
    }

    public void clickStartWithLoremIpsum() {
        selectStartWithLoremIpsum.click();
    }
}
