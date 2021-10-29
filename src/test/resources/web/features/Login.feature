Feature: Como usuario quiero ingresar mis credenciales para entrar a mi cuenta

  @Smoke
  Scenario Outline: Login con credenciales correctas
    Given estoy en la pantalla de Login
    When ingreso mi usuario <usuario> y contraseña <password>
    Then ingreso a My Account

    Examples:
      | usuario                 | password |
      | gonzalosoriano@test.com | 123456   |


