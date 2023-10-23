package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {
    AutomationExercisePage automationExercisePage = new AutomationExercisePage();


    @Given("kullanici aeUrl adresine gider")
    public void kullaniciAeUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
    }

    @Then("kullanici login linkine tiklar")
    public void kullaniciLoginLinkineTiklar() {
        automationExercisePage.loginLinki.click();
    }

    @Then("dogru bilgilerle giris yapar")
    public void dogruBilgilerleGirisYapar() {
        automationExercisePage.loginEmail.sendKeys(ConfigReader.getProperty("aeUsername"));
        automationExercisePage.loginPass.sendKeys(ConfigReader.getProperty("aePassword"));
    }

    @Then("basarili giris yapildigini dogrular")
    public void basariliGirisYapildiginiDogrular() {
        String expectedVerify = "Logout";
        String actualVerify = automationExercisePage.dogrulama.getText();
        Assert.assertTrue(actualVerify.contains(expectedVerify));

    }


}

