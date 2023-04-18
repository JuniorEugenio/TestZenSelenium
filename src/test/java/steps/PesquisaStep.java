package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import runner.RunCucumberTest;

import static org.junit.Assert.assertEquals;

public class PesquisaStep extends RunCucumberTest {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site blogagi")
    public void acessar_site_blogagi() {
        homePage.acessarAplicacao();

    }
    @Quando("^eu clico na lupa de busca")
    public void eu_clico_na_lupa_de_busca() {
        homePage.lupaBusca();
    }
    @E("^preencho o campo de pesquisa com a informação sua carreira")
    public void preencho_o_campo_de_pesquisa_com_a_informação_sua_carreira() {
        homePage.campoBusca();
    }

    @E("^clico no botão pesquisar")
    public void clico_no_botão_pesquisar() {
        homePage.botaoPesquisar();

    }

    @Então("^eu vejo o resultado da busca")
    public void eu_vejo_o_resultado_da_busca() {
        homePage.resultadoBusca();
        driver.quit();

    }

    }
