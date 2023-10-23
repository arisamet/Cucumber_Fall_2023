package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HerokuappStepdefinitions {

    HerokuappPage herokuappPage = new HerokuappPage();



    @When("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        try {

            if (herokuappPage.deleteButonu.isDisplayed()){
                Assert.assertTrue(false);
            }
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }

    @When("Add Element butona basar")
    public void addElementButonaBasar() {

        herokuappPage.addElementButonu.click();
        }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        // buton implicitly wait suresi icinde gorunur oldugundan
        // bu adimda kod yazilmadi
    }

    @Then("butonunun gorunur oldugunu test edin")
    public void butonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());

    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin()
    { herokuappPage.deleteButonu.click();}

    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        try {

            if (herokuappPage.deleteButonu.isDisplayed()){
                Assert.assertTrue(false);
            }
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }
    }