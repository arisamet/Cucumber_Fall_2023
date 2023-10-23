package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);}




    @FindBy (xpath = "(//a[normalize-space()='Signup / Login'])[1]")
    public WebElement loginLinki;

    @FindBy(xpath="//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath="//input[@data-qa='login-password']")
    public WebElement loginPass;

    @FindBy(xpath="//input[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy (xpath="//*[@class='fa fa-user']")
    public WebElement dogrulama;
}

