package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsturPage {
    public EtsturPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span['Giriş Yap'])[4]")
    public WebElement loginButonu;
    @FindBy(xpath = "(//b[contains(text(),'Giriş Yap')]")
    public WebElement gercekgirisButonu;

    @FindBy(xpath = "//button [@data-target='#modalSignIn']")
    public WebElement girisButonu;

    @FindBy(id = "//input[@id='tb-contactEmailSignIn']")
    public WebElement emailButonu;

    @FindBy(id = "//input[@id='showPass_2']")
    public WebElement passwordButonu;

    @FindBy(id = "//button[@id='btn-signin']")
    public WebElement girisYapButonu;


}



