package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// Essa classe auxilia nas ações realizadas pelo WebDriver.


public class Utils {
    private WebDriver driver;
    private WebDriverWait espera;


    public Utils(WebDriver driver) {
        this.driver = driver;

    }

    public void cliclarPorId(String campo_texo) {

        driver.findElement(By.id(campo_texo)).click();

    }

    public void clicarPorXpath(String campo_texto) {
        driver.findElement(By.xpath(campo_texto)).click();
    }

    public void clicarPorCssSelector(String campo_texto) {
        driver.findElement(By.cssSelector(campo_texto)).click();
    }

    public void textoPorId(String campo_id, String value) {
        driver.findElement(By.id(campo_id)).sendKeys(value);

    }

    public void textoPorXpath(String campo_id, String value) {
        driver.findElement(By.xpath(campo_id)).sendKeys(value);
    }

    public void textoPorCssSelector(String campo_id, String value) {
        driver.findElement(By.cssSelector(campo_id)).sendKeys(value);
    }
    public void esperaElementoporCssSelector(String wait){
        espera = new WebDriverWait(driver, 5);
        espera.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(wait)));
    }

    public void esperaElementoporXpath(String wait){
        espera = new WebDriverWait(driver, 5);
        espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wait)));
    }
}
