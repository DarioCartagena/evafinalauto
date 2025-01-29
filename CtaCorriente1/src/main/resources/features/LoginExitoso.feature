Feature: Inicio de Sesión

  Scenario: Usuario ingresa con credenciales correctas
    Given el usuario está en la página de inicio de sesión
    When ingresa su usuario "usuario1" y su contraseña "123456"
    Then debe acceder a su cuenta correctamente
