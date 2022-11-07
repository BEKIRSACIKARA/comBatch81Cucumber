package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.PanaromaPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.lang.module.Configuration;

public class PanaromaStepDefinition {
    PanaromaPage panorama = new PanaromaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("kullanici kullaniciadi ve sifre gider giriş butonuna basar")
    public void kullaniciKullaniciadiVeSifreGiderGirişButonunaBasar() {
        panorama.kullaniciadi.sendKeys("dileksugida3");
               // sendKeys("Ebn102030").
              //  sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();








    }

    @And("kullanici yeni bildirimlerden kapat butonunu tiklar")
    public void kullaniciYeniBildirimlerdenKapatButonunuTiklar() {
    }

    @And("kullanici fovoriler butonunu tıklar")
    public void kullaniciFovorilerButonunuTıklar() {
    }

    @And("kullanici müşteriler butonunu tıklar ve kod kısmını tıklar")
    public void kullaniciMüşterilerButonunuTıklarVeKodKısmınıTıklar() {
    }
}
