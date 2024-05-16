
@tag
Feature: Abertura de conta

  @tag1
  Scenario: Abertura de conta PF
    Given que acesse a url "https://nubank.com.br/" 
    And preencha o campo cpf
    When preencher o formulario de abertua de conta
    Then realizo a validacao de formulario enviado com sucesso
    

