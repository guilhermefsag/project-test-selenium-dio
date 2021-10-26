package pages;

import org.openqa.selenium.WebDriver;
import utils.Utils;

public class FazerLoginPage {

    private WebDriver driver;
    private Utils util;

    public FazerLoginPage(WebDriver driver) {
        this.driver = driver;
        util = new Utils(driver);
    }

    public void fazerLogin() {
        driver.get("http://automationpractice.com/index.php");
        util.clicarPorXpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]");
        util.textoPorCssSelector("#email", "emaildetestedio@gmail.com");
        util.textoPorCssSelector("#passwd", "@testedio123");
        util.clicarPorXpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]");
    }   

}
