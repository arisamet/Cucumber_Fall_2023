package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.EtsturPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class EtsturStepdefinitions {

EtsturPage etsturPage = new EtsturPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("etsturUrl"));
    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {
     actions.clickAndHold(etsturPage.gercekgirisButonu);

    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {
        etsturPage.girisButonu.click();

    }

    @And("eposta girilir")
    public void epostaGirilir() {
    etsturPage.emailButonu.sendKeys("samet123@gmail.com");
    }

    @And("password girilir")
    public void passwordGirilir() {
        etsturPage.passwordButonu.sendKeys("zamazingo_98");

    }

    @And("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {
        etsturPage.girisYapButonu.click();

    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {
        String expectedTitle= "";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
