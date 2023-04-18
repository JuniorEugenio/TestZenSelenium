package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.PesquisaStep;

import static org.junit.Assert.assertEquals;
import static runner.RunBase.driver;

public class HomePage {
    private final WebDriver driver;

    //WebDriver driver = new ChromeDriver();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicacao(){
        driver.get("https://blogdoagi.com.br/");
        driver.manage().window().maximize();
    }

    public void lupaBusca(){
        driver.findElement(By.id("search-open")).click();
    }

    public void campoBusca(){
        driver.findElement(By.cssSelector(".desktop-search label input")).sendKeys("Sua Carreira");

    }

    public void botaoPesquisar(){
        driver.findElement(By.cssSelector(".desktop-search label input")).submit();

    }

    public void resultadoBusca(){
        String textoElement = driver.findElement(By.cssSelector("#primary h1 span")).getText();
        assertEquals("Sua Carreira", textoElement);
    }
}
