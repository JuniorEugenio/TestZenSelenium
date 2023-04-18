$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pesquisa.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar pesquisa no campo de busca",
  "description": "Eu como usuario\r\nquero realizar pesquisa no campos de busca\r\npara validar a funcionalidade",
  "id": "realizar-pesquisa-no-campo-de-busca",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Realizar uma pesquisa no campo de busca",
  "description": "",
  "id": "realizar-pesquisa-no-campo-de-busca;realizar-uma-pesquisa-no-campo-de-busca",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou no site blogagi",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "eu clico na lupa de busca",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "preencho o campo de pesquisa com a informação sua carreira",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clico no botão pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu vejo o resultado da busca",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisaStep.acessar_site_blogagi()"
});
formatter.result({
  "duration": 6798519700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaStep.eu_clico_na_lupa_de_busca()"
});
formatter.result({
  "duration": 114612000,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaStep.preencho_o_campo_de_pesquisa_com_a_informação_sua_carreira()"
});
formatter.result({
  "duration": 76149300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaStep.clico_no_botão_pesquisar()"
});
formatter.result({
  "duration": 992855900,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaStep.eu_vejo_o_resultado_da_busca()"
});
formatter.result({
  "duration": 721488400,
  "status": "passed"
});
});