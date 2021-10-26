package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FazerCadastroPage;

public class FazerCadastroPageTest {
    private WebDriver driver;
    private FazerCadastroPage fazerCadastroPage;


    @Before
    public void iniciaDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        fazerCadastroPage = new FazerCadastroPage(driver);

    }

    @Test
    public void realizaOCadastro(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        fazerCadastroPage.fazOCadastro();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")));
        WebElement validaTexto = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
        Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
    }

}
