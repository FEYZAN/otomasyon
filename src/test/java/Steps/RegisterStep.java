package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.UUID;

public class RegisterStep extends BaseStep {
    String uuid = UUID.randomUUID().toString();

    @Given("^\\(Diyelim ki\\) OBSS Web adresine giriş yapılır\\.$")
    public void diyelimKiOBSSWebAdresineGirişYapılır() {
        getUrl();
    }

    @When("^\\(Eğer ki\\) Search ikonuna tıklanarak text alana Automation yazıldığında çıkan ilk linke tıklanırsa$")
    public void eğerKiSearchIkonunaTıklanarakTextAlanaAutomationYazıldığındaÇıkanIlkLinkeTıklanırsa() {
        findElementClick ("searchIcon", Pather.id);
        findElement("searchLabel", Pather.id).sendKeys("automation");
    }

    @Then("^\\(O zaman\\) Sayfanın en altına gidildiğinde Obss Footer'ının geldiği görülür\\.$")
    public void oZamanSayfanınEnAltınaGidildiğindeObssFooterInınGeldiğiGörülür() {
    }

    @And("^driver close$")
    public void driverClose() {
        DriverQuit();
    }
}
