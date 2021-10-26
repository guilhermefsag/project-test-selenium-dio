package pages;
import org.openqa.selenium.WebDriver;
import utils.Utils;

public class FazerCadastroPage {

   private WebDriver driver;
   private Utils util;

    public FazerCadastroPage(WebDriver driver) {
        this.driver = driver;
        util = new Utils(driver);
    }

        public void fazOCadastro(){
        driver.get("http://automationpractice.com/index.php");
        util.clicarPorXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]");
        util.textoPorCssSelector("#email_create", "emaildetested2232io@gmail.com"); // Deverá ser alterado para um email válido pois esse já está cadastrado.
        util.clicarPorXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
        util.esperaElementoporCssSelector("#customer_firstname");
        util.cliclarPorId("id_gender1");
        util.textoPorId("customer_firstname", "Guilherme");
        util.textoPorId("customer_lastname", "Augusto");
        util.textoPorId("passwd", "@testedio123");
        util.textoPorId("days", "4");
        util.textoPorId("months", "January");
        util.textoPorId("years", "1997");
        util.textoPorId("address1", "Street name, 123");
        util.textoPorId("city", "Bayonne");
        util.textoPorId("id_state", "New Jersey");
        util.textoPorId("postcode", "07002");
        util.textoPorId("id_country", "United States");
        util.textoPorId("phone_mobile", "9999999999");
        util.clicarPorXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
    }
}
