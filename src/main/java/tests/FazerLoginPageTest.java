package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FazerLoginPage;

public class FazerLoginPageTest {

    private WebDriver driver;
    private FazerLoginPage fazerLoginPage;


    @Before
    public void iniciaDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        fazerLoginPage = new FazerLoginPage(driver);
    }

    @Test
    public void fazLogin() {
        WebDriverWait wait = new WebDriverWait(driver, 05);
        fazerLoginPage.fazerLogin();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")));
        WebElement validarTexto = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]"));
        Assert.assertEquals("MY WISHLISTS", validarTexto.getText());
    }

    @After
    public void aposTeste() {
        driver.quit();
    }
}
