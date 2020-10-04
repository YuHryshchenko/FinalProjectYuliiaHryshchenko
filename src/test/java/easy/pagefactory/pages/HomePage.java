package easy.pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='Languages']//a[@class='ru' and contains(.,'Pyccкий')]")
    private WebElement clickToRussianVersionSite;

    @FindBy(xpath = "//div[@id='Panes']//input[@id='generate']")
    private WebElement buttonGenerateLoremIpsumOnEnglishVersionSite;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void setClickToRussianVersionSite() {
        clickToRussianVersionSite.click();
    }

    public void clickButtonGenerateLoremIpsumOnEnglishVersionSite() {
        buttonGenerateLoremIpsumOnEnglishVersionSite.click();
    }


}
